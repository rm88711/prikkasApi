package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.EnderecoCliente;
import br.com.alura.prikkas.repository.EnderecoClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoClienteService {

    @Autowired
    EnderecoClienteRepository enderecoClienteRepository;

    public Page<EnderecoCliente> listAll(Pageable paginacao){
        return enderecoClienteRepository.findAll(paginacao);
    }

    public void save(EnderecoCliente enderecoCliente){
        enderecoClienteRepository.save(enderecoCliente);
    }

    public Optional<EnderecoCliente> get(Long id){
        return enderecoClienteRepository.findById(id);
    }

    public void deleteById(Long id) {
        enderecoClienteRepository.deleteById(id);
    }
}
