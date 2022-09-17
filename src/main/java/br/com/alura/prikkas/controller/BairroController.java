package br.com.alura.prikkas.controller;

import br.com.alura.prikkas.model.Bairro;
import br.com.alura.prikkas.service.BairroService;
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
@RequestMapping("/api/bairro")
public class BairroController {

    @Autowired
    private BairroService service;

    @GetMapping
    public Page<Bairro> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<Bairro> create(@RequestBody @Valid Bairro bairro){
        service.save(bairro);
        return ResponseEntity.status(HttpStatus.CREATED).body(bairro);
    }

    @GetMapping("{id}")
    public ResponseEntity<Bairro> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<Bairro> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Bairro> update(@PathVariable Long id, @RequestBody @Valid Bairro newBairro){
        // carregar a tarefa do banco
        Optional<Bairro> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        Bairro bairro = optional.get();
        BeanUtils.copyProperties(newBairro, bairro);
        bairro.setIdBairro(id);

        // salvar a tarefa
        service.save(bairro);

        return ResponseEntity.ok(bairro);

    }

}