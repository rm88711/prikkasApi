package br.com.alura.prikkas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alura.prikkas.model.Endereco;
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {}
