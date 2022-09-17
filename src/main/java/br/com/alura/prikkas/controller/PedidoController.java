package br.com.alura.prikkas.controller;


import br.com.alura.prikkas.model.EnderecoRestaurante;
import br.com.alura.prikkas.model.Pedido;
import br.com.alura.prikkas.service.PedidoService;
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
@RequestMapping("/api/pedido")
public class PedidoController {
    @Autowired
    private PedidoService service;

    @GetMapping
    public Page<Pedido> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<Pedido> create(@RequestBody @Valid Pedido pedido){
        service.save(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedido);
    }

    @GetMapping("{id}")
    public ResponseEntity<Pedido> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<Pedido> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Pedido> update(@PathVariable Long id, @RequestBody @Valid Pedido newPedido){
        // carregar a tarefa do banco
        Optional<Pedido> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        Pedido pedido = optional.get();
        BeanUtils.copyProperties(newPedido, pedido);
        pedido.setIdPedido(id);

        // salvar a tarefa
        service.save(pedido);

        return ResponseEntity.ok(pedido);

    }
}
