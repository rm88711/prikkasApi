package br.com.alura.prikkas.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alura.prikkas.model.TelefoneRestaurante;
public interface TelefoneRestauranteRepository extends JpaRepository<TelefoneRestaurante, Long> {}
