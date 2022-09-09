package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.Telefone;
import br.com.alura.prikkas.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class TelefoneService {

    @Autowired
    TelefoneRepository telefoneRepository;

    public Page<Telefone> listAll(Pageable paginacao){
        return telefoneRepository.findAll(paginacao);
    }

    public void save(Telefone telefone){
        telefoneRepository.save(telefone);
    }

    public Optional<Telefone> get(Long id){
        return telefoneRepository.findById(id);
    }

    public void deleteById(Long id) {
        telefoneRepository.deleteById(id);
    }

}
