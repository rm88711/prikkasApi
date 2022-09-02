package br.com.alura.prikkas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alura.prikkas.model.Restaurante;
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {}
