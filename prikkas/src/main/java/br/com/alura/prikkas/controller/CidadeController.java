package br.com.alura.prikkas.controller;

import br.com.alura.prikkas.model.Cidade;
import br.com.alura.prikkas.service.CidadeService;
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
@RequestMapping("/api/cidade")
public class CidadeController {

    @Autowired
    private CidadeService service;

    @GetMapping
    public Page<Cidade> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<Cidade> create(@RequestBody @Valid Cidade cidade){
        service.save(cidade);
        return ResponseEntity.status(HttpStatus.CREATED).body(cidade);
    }

    @GetMapping("{id}")
    public ResponseEntity<Cidade> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<Cidade> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Cidade> update(@PathVariable Long id, @RequestBody @Valid Cidade newCidade){
        // carregar a tarefa do banco
        Optional<Cidade> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        Cidade cidade = optional.get();
        BeanUtils.copyProperties(newCidade, cidade);
        cidade.setId(id);

        // salvar a tarefa
        service.save(cidade);

        return ResponseEntity.ok(cidade);

    }

}
