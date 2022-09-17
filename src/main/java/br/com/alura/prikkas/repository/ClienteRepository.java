package br.com.alura.prikkas.repository;

import br.com.alura.prikkas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}