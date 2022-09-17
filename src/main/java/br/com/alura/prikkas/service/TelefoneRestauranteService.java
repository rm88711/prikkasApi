package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.TelefoneCliente;
import br.com.alura.prikkas.model.TelefoneRestaurante;
import br.com.alura.prikkas.repository.TelefoneClienteRepository;
import br.com.alura.prikkas.repository.TelefoneRestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TelefoneRestauranteService {
    @Autowired
    TelefoneRestauranteRepository telefoneRestauranteRepository;

    public Page<TelefoneRestaurante> listAll(Pageable paginacao){ return telefoneRestauranteRepository.findAll(paginacao);
    }

    public void save(TelefoneRestaurante telefoneRestaurante){
        telefoneRestauranteRepository.save(telefoneRestaurante);
    }

    public Optional<TelefoneRestaurante> get(Long id){
        return telefoneRestauranteRepository.findById(id);
    }

    public void deleteById(Long id) {
        telefoneRestauranteRepository.deleteById(id);
    }
}
