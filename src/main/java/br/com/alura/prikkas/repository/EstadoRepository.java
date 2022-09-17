package br.com.alura.prikkas.repository;

import br.com.alura.prikkas.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EstadoRepository extends JpaRepository<Estado, Long> {}