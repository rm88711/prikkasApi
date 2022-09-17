package br.com.alura.prikkas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alura.prikkas.model.Carrinho;
public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {}