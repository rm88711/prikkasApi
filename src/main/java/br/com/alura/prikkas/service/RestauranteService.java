package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.Restaurante;
import br.com.alura.prikkas.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RestauranteService {

    @Autowired
    RestauranteRepository restauranteRepository;

    public Page<Restaurante> listAll(Pageable paginacao){
        return restauranteRepository.findAll(paginacao);
    }

    public void save(Restaurante restaurante){
        restauranteRepository.save(restaurante);
    }

    public Optional<Restaurante> get(Long id){
        return restauranteRepository.findById(id);
    }

    public void deleteById(Long id) {
        restauranteRepository.deleteById(id);
    }
    
}
