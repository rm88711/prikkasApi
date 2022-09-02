package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.EnderecoRestaurante;
import br.com.alura.prikkas.repository.EnderecoRestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoRestauranteService {
    @Autowired
    EnderecoRestauranteRepository enderecoRestauranteRepository;

    public Page<EnderecoRestaurante> listAll(Pageable paginacao){
        return enderecoRestauranteRepository.findAll(paginacao);
    }

    public void save(EnderecoRestaurante enderecoRestaurante){
        enderecoRestauranteRepository.save(enderecoRestaurante);
    }

    public Optional<EnderecoRestaurante> get(Long id){
        return enderecoRestauranteRepository.findById(id);
    }

    public void deleteById(Long id) {
        enderecoRestauranteRepository.deleteById(id);
    }
}
