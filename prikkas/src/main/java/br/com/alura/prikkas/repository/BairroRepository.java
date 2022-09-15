package br.com.alura.prikkas.repository;

import br.com.alura.prikkas.model.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BairroRepository extends JpaRepository<Bairro, Long> {

}