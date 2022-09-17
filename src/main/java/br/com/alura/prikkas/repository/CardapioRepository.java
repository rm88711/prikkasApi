package br.com.alura.prikkas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alura.prikkas.model.Cardapio;
public interface CardapioRepository extends JpaRepository<Cardapio, Long> {}