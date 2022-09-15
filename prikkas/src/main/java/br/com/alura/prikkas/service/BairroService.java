package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.Bairro;
import br.com.alura.prikkas.repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BairroService {

    @Autowired
    BairroRepository bairroRepository;

    public Page<Bairro> listAll(Pageable paginacao){
        return bairroRepository.findAll(paginacao);
    }

    public void save(Bairro bairro){
        bairroRepository.save(bairro);
    }

    public Optional<Bairro> get(Long id){
        return bairroRepository.findById(id);
    }

    public void deleteById(Long id) {
        bairroRepository.deleteById(id);
    }
}
