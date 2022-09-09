package br.com.alura.prikkas.controller;


import br.com.alura.prikkas.model.EnderecoRestaurante;
import br.com.alura.prikkas.service.EnderecoRestauranteService;
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
@RequestMapping("/api/enderecoRestaurante")
public class EnderecoRestauranteController {
//AQUI
    @Autowired
    private EnderecoRestauranteService service;

    @GetMapping
    public Page<EnderecoRestaurante> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<EnderecoRestaurante> create(@RequestBody @Valid EnderecoRestaurante enderecoRestaurante){
        service.save(enderecoRestaurante);
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoRestaurante);
    }

    @GetMapping("{id}")
    public ResponseEntity<EnderecoRestaurante> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<EnderecoRestaurante> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<EnderecoRestaurante> update(@PathVariable Long id, @RequestBody @Valid EnderecoRestaurante newEnderecoRestaurante){
        // carregar a tarefa do banco
        Optional<EnderecoRestaurante> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        EnderecoRestaurante enderecoRestaurante = optional.get();
        BeanUtils.copyProperties(newEnderecoRestaurante, enderecoRestaurante);
        enderecoRestaurante.setIdEnredeco(id);

        // salvar a tarefa
        service.save(enderecoRestaurante);

        return ResponseEntity.ok(enderecoRestaurante);

    }
}
