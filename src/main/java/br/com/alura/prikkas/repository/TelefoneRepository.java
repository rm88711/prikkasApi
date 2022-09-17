package br.com.alura.prikkas.repository;

import br.com.alura.prikkas.model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {}