package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.Endereco;
import br.com.alura.prikkas.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    public Page<Endereco> listAll(Pageable paginacao){
        return enderecoRepository.findAll(paginacao);
    }

    public void save(Endereco endereco){
        enderecoRepository.save(endereco);
    }

    public Optional<Endereco> get(Long id){
        return enderecoRepository.findById(id);
    }

    public void deleteById(Long id) {
        enderecoRepository.deleteById(id);
    }
    
}
