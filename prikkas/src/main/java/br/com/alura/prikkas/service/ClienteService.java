package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.Cliente;
import br.com.alura.prikkas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Page<Cliente> listAll(Pageable paginacao){
        return clienteRepository.findAll(paginacao);
    }

    public void save(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public Optional<Cliente> get(Long id){
        return clienteRepository.findById(id);
    }

    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }
}