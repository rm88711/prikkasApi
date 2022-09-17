package br.com.alura.prikkas.service;

import br.com.alura.prikkas.model.Estado;
import br.com.alura.prikkas.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class EstadoService {
    @Autowired
    EstadoRepository estadoRepository;

    public Page<Estado> listAll(Pageable paginacao){
        return estadoRepository.findAll(paginacao);
    }

    public void save(Estado estado){
        estadoRepository.save(estado);
    }

    public Optional<Estado> get(Long id){
        return estadoRepository.findById(id);
    }

    public void deleteById(Long id) {
        estadoRepository.deleteById(id);
    }
}
