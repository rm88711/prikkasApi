package br.com.alura.prikkas.controller;

import br.com.alura.prikkas.model.TelefoneCliente;
import br.com.alura.prikkas.service.TelefoneClienteService;
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
@RequestMapping("/api/telefoneCliente")
public class TelefoneClienteController {

    @Autowired
    private TelefoneClienteService service;

    @GetMapping
    public Page<TelefoneCliente> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<TelefoneCliente> create(@RequestBody @Valid TelefoneCliente telefoneCliente){
        service.save(telefoneCliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(telefoneCliente);
    }

    @GetMapping("{id}")
    public ResponseEntity<TelefoneCliente> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<TelefoneCliente> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<TelefoneCliente> update(@PathVariable Long id, @RequestBody @Valid TelefoneCliente newTelefoneCliente){
        // carregar a tarefa do banco
        Optional<TelefoneCliente> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        TelefoneCliente telefoneCliente = optional.get();
        BeanUtils.copyProperties(newTelefoneCliente, telefoneCliente);
        telefoneCliente.setIdTel(id);

        // salvar a tarefa
        service.save(telefoneCliente);

        return ResponseEntity.ok(telefoneCliente);

    }

}
