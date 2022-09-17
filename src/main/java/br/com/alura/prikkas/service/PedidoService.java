package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.Pedido;
import br.com.alura.prikkas.model.PedidoItem;
import br.com.alura.prikkas.repository.PedidoItemRepository;
import br.com.alura.prikkas.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    PedidoRepository pedidoRepository;

    public Page<Pedido> listAll(Pageable paginacao){
        return pedidoRepository.findAll(paginacao);
    }

    public void save(Pedido pedido){
        pedidoRepository.save(pedido);
    }

    public Optional<Pedido> get(Long id){
        return pedidoRepository.findById(id);
    }

    public void deleteById(Long id) {
        pedidoRepository.deleteById(id);
    }
}
