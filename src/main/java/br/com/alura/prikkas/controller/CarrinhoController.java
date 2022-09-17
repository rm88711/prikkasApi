package br.com.alura.prikkas.controller;

import br.com.alura.prikkas.model.Carrinho;
import br.com.alura.prikkas.service.CarrinhoService;
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
@RequestMapping("/api/carrinho")
public class CarrinhoController {
    @Autowired
    private CarrinhoService service;

    @GetMapping
    public Page<Carrinho> index(@PageableDefault(size=50) Pageable paginacao){

        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<Carrinho> create(@RequestBody @Valid Carrinho carrinho){
        service.save(carrinho);
        return ResponseEntity.status(HttpStatus.CREATED).body(carrinho);
    }

    @GetMapping("{id}")
    public ResponseEntity<Carrinho> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<Carrinho> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Carrinho> update(@PathVariable Long id, @RequestBody @Valid Carrinho newCarrinho){
        // carregar a tarefa do banco
        Optional<Carrinho> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        Carrinho carrinho = optional.get();
        BeanUtils.copyProperties(newCarrinho, carrinho);
        carrinho.setIdPedido(id);

        // salvar a tarefa
        service.save(carrinho);

        return ResponseEntity.ok(carrinho);

    }
}
