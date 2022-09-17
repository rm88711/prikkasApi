package br.com.alura.prikkas.repository;

import br.com.alura.prikkas.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}