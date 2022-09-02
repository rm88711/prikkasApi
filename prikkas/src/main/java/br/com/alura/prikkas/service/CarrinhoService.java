package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.Carrinho;
import br.com.alura.prikkas.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarrinhoService {

    @Autowired
    CarrinhoRepository carrinhoRepository;

    public Page<Carrinho> listAll(Pageable paginacao){
        return carrinhoRepository.findAll(paginacao);
    }

    public void save(Carrinho carrinho){
        carrinhoRepository.save(carrinho);
    }

    public Optional<Carrinho> get(Long id){
        return carrinhoRepository.findById(id);
    }

    public void deleteById(Long id) {
        carrinhoRepository.deleteById(id);
    }
}
