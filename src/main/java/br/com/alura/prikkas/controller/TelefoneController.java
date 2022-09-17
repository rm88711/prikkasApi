package br.com.alura.prikkas.controller;


import br.com.alura.prikkas.model.Telefone;
import br.com.alura.prikkas.service.TelefoneService;
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
@RequestMapping("/api/telefone")
public class TelefoneController {

    @Autowired
    private TelefoneService service;

    @GetMapping
    public Page<Telefone> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<Telefone> create(@RequestBody @Valid Telefone telefone){
        service.save(telefone);
        return ResponseEntity.status(HttpStatus.CREATED).body(telefone);
    }

    @GetMapping("{id}")
    public ResponseEntity<Telefone> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<Telefone> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Telefone> update(@PathVariable Long id, @RequestBody @Valid Telefone newTelefone){
        // carregar a tarefa do banco
        Optional<Telefone> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        Telefone telefone = optional.get();
        BeanUtils.copyProperties(newTelefone, telefone);
        telefone.setIdTelefone(id);

        // salvar a tarefa
        service.save(telefone);

        return ResponseEntity.ok(telefone);

    }

}
