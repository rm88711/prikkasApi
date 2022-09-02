package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.Cardapio;
import br.com.alura.prikkas.repository.CardapioRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CardapioService {
    @Autowired
    CardapioRepository cardapioRepository;

    public Page<Cardapio> listAll(Pageable paginacao){
        return cardapioRepository.findAll(paginacao);
    }

    public void save(Cardapio cardapio){
        cardapioRepository.save(cardapio);
    }

    public Optional<Cardapio> get(Long id){
        return cardapioRepository.findById(id);
    }

    public void deleteById(Long id) {
        cardapioRepository.deleteById(id);
    }
    
}
