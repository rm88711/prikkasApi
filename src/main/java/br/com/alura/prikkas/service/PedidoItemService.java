package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.PedidoItem;
import br.com.alura.prikkas.repository.PedidoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoItemService {

    @Autowired
    PedidoItemRepository pedidoItemRepository;

    public Page<PedidoItem> listAll(Pageable paginacao){
        return pedidoItemRepository.findAll(paginacao);
    }

    public void save(PedidoItem pedidoItem){
        pedidoItemRepository.save(pedidoItem);
    }

    public Optional<PedidoItem> get(Long id){
        return pedidoItemRepository.findById(id);
    }

    public void deleteById(Long id) {
        pedidoItemRepository.deleteById(id);
    }
}
