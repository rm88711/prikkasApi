package br.com.alura.prikkas.controller;

import br.com.alura.prikkas.model.Restaurante;
import br.com.alura.prikkas.service.RestauranteService;
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
@RequestMapping("/api/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService service;

    @GetMapping
    public Page<Restaurante> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<Restaurante> create(@RequestBody @Valid Restaurante restaurante){
        service.save(restaurante);
        return ResponseEntity.status(HttpStatus.CREATED).body(restaurante);
    }

    @GetMapping("{id}")
    public ResponseEntity<Restaurante> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<Restaurante> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Restaurante> update(@PathVariable Long id, @RequestBody @Valid Restaurante newRestaurante){
        // carregar a tarefa do banco
        Optional<Restaurante> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        Restaurante restaurante = optional.get();
        BeanUtils.copyProperties(newRestaurante, restaurante);
        restaurante.setIdRestaurante(id);

        // salvar a tarefa
        service.save(restaurante);

        return ResponseEntity.ok(restaurante);

    }

}
