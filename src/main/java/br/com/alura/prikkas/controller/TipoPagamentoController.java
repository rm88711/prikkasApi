package br.com.alura.prikkas.controller;

import br.com.alura.prikkas.model.TipoPagamento;
import br.com.alura.prikkas.service.TipoPagamentoService;
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
@RequestMapping("/api/tipopagamento")
public class TipoPagamentoController {
    @Autowired
    private TipoPagamentoService service;

    @GetMapping
    public Page<TipoPagamento> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<TipoPagamento> create(@RequestBody @Valid TipoPagamento tipoPagamento){
        service.save(tipoPagamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoPagamento);
    }

    @GetMapping("{id}")
    public ResponseEntity<TipoPagamento> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<TipoPagamento> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<TipoPagamento> update(@PathVariable Long id, @RequestBody @Valid TipoPagamento newTipoPagamento){
        // carregar a tarefa do banco
        Optional<TipoPagamento> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        TipoPagamento tipoPagamento = optional.get();
        BeanUtils.copyProperties(newTipoPagamento, tipoPagamento);
        tipoPagamento.setIdPagamento(id);

        // salvar a tarefa
        service.save(tipoPagamento);

        return ResponseEntity.ok(tipoPagamento);

    }
}
