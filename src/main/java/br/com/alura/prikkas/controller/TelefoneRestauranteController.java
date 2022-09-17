package br.com.alura.prikkas.controller;

import br.com.alura.prikkas.model.TelefoneRestaurante;
import br.com.alura.prikkas.service.TelefoneRestauranteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/telefoneRestaurante")
public class TelefoneRestauranteController {

    @Autowired
    private TelefoneRestauranteService service;

    @GetMapping
    public Page<TelefoneRestaurante> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<TelefoneRestaurante> create(@RequestBody @Valid TelefoneRestaurante telefoneRestaurante){
        service.save(telefoneRestaurante);
        return ResponseEntity.status(HttpStatus.CREATED).body(telefoneRestaurante);
    }

    @GetMapping("{id}")
    public ResponseEntity<TelefoneRestaurante> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<TelefoneRestaurante> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<TelefoneRestaurante> update(@PathVariable Long id, @RequestBody @Valid TelefoneRestaurante newTelefoneRestaurante){
        // carregar a tarefa do banco
        Optional<TelefoneRestaurante> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        TelefoneRestaurante telefoneRestaurante = optional.get();
        BeanUtils.copyProperties(newTelefoneRestaurante, telefoneRestaurante);
        telefoneRestaurante.setIdTel(id);

        // salvar a tarefa
        service.save(telefoneRestaurante);

        return ResponseEntity.ok(telefoneRestaurante);

    }

}
