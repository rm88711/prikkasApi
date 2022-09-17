package br.com.alura.prikkas.controller;

import br.com.alura.prikkas.model.EnderecoCliente;
import br.com.alura.prikkas.service.EnderecoClienteService;
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
@RequestMapping("/api/enderecoCliente")
public class EnderecoClienteController {

    @Autowired
    private EnderecoClienteService service;

    @GetMapping
    public Page<EnderecoCliente> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<EnderecoCliente> create(@RequestBody @Valid EnderecoCliente enderecoCliente){
        service.save(enderecoCliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoCliente);
    }

    @GetMapping("{id}")
    public ResponseEntity<EnderecoCliente> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<EnderecoCliente> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<EnderecoCliente> update(@PathVariable Long id, @RequestBody @Valid EnderecoCliente newEnderecoCliente){
        // carregar a tarefa do banco
        Optional<EnderecoCliente> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        EnderecoCliente enderecoCliente = optional.get();
        BeanUtils.copyProperties(newEnderecoCliente, enderecoCliente);
        enderecoCliente.setIdEndereco(id);

        // salvar a tarefa
        service.save(enderecoCliente);

        return ResponseEntity.ok(enderecoCliente);

    }

}
