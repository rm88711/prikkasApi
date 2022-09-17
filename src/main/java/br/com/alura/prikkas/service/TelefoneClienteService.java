package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.Pedido;
import br.com.alura.prikkas.model.TelefoneCliente;
import br.com.alura.prikkas.repository.PedidoRepository;
import br.com.alura.prikkas.repository.TelefoneClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TelefoneClienteService {

    @Autowired
    TelefoneClienteRepository telefoneClienteRepository;

    public Page<TelefoneCliente> listAll(Pageable paginacao){
        return telefoneClienteRepository.findAll(paginacao);
    }

    public void save(TelefoneCliente telefoneCliente){
        telefoneClienteRepository.save(telefoneCliente);
    }

    public Optional<TelefoneCliente> get(Long id){
        return telefoneClienteRepository.findById(id);
    }

    public void deleteById(Long id) {
        telefoneClienteRepository.deleteById(id);
    }
}
