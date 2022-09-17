package br.com.alura.prikkas.controller;


import br.com.alura.prikkas.model.Cardapio;
import br.com.alura.prikkas.model.Cliente;
import br.com.alura.prikkas.service.CardapioService;
import br.com.alura.prikkas.service.ClienteService;
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
@RequestMapping("/api/cardapio")
public class CardapioController {

    @Autowired
    private CardapioService service;

    @GetMapping
    public Page<Cardapio> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<Cardapio> create(@RequestBody @Valid Cardapio cardapio){
        service.save(cardapio);
        return ResponseEntity.status(HttpStatus.CREATED).body(cardapio);
    }

    @GetMapping("{id}")
    public ResponseEntity<Cardapio> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<Cardapio> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Cardapio> update(@PathVariable Long id, @RequestBody @Valid Cliente newCardapio){
        // carregar a tarefa do banco
        Optional<Cardapio> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        Cardapio cardapio = optional.get();
        BeanUtils.copyProperties(newCardapio, cardapio);
        cardapio.setIdCardapio(id);

        // salvar a tarefa
        service.save(cardapio);

        return ResponseEntity.ok(cardapio);

    }

}
