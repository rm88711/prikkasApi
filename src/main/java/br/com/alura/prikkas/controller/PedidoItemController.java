package br.com.alura.prikkas.controller;


import br.com.alura.prikkas.model.PedidoItem;
import br.com.alura.prikkas.service.PedidoItemService;
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
@RequestMapping("/api/pedidoitem")
public class PedidoItemController {

    @Autowired
    private PedidoItemService service;

    @GetMapping
    public Page<PedidoItem> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<PedidoItem> create(@RequestBody @Valid PedidoItem pedidoitem){
        service.save(pedidoitem);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoitem);
    }

    @GetMapping("{id}")
    public ResponseEntity<PedidoItem> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<PedidoItem> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<PedidoItem> update(@PathVariable Long id, @RequestBody @Valid PedidoItem newPedidoItem){
        // carregar a tarefa do banco
        Optional<PedidoItem> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        PedidoItem pedidoitem = optional.get();
        BeanUtils.copyProperties(newPedidoItem, pedidoitem);
        pedidoitem.setIdPedido(id);

        // salvar a tarefa
        service.save(pedidoitem);

        return ResponseEntity.ok(pedidoitem);

    }

}
