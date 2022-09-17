package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.Cidade;
import br.com.alura.prikkas.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository  cidadeRepository;

    public Page<Cidade> listAll(Pageable paginacao){
        return cidadeRepository.findAll(paginacao);
    }

    public void save(Cidade cidade){
        cidadeRepository.save(cidade);
    }

    public Optional<Cidade> get(Long id){
        return cidadeRepository.findById(id);
    }

    public void deleteById(Long id) {
        cidadeRepository.deleteById(id);
    }
}