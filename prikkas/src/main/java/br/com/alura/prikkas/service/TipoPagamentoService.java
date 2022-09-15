package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.TipoPagamento;
import br.com.alura.prikkas.repository.TipoPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TipoPagamentoService {
    @Autowired
    TipoPagamentoRepository tipoPagamentoRepository;

    public Page<TipoPagamento> listAll(Pageable paginacao){
        return tipoPagamentoRepository.findAll(paginacao);
    }

    public void save(TipoPagamento tipoPagamento){
        tipoPagamentoRepository.save(tipoPagamento);
    }

    public Optional<TipoPagamento> get(Long id){
        return tipoPagamentoRepository.findById(id);
    }

    public void deleteById(Long id) {
        tipoPagamentoRepository.deleteById(id);
    }
}
