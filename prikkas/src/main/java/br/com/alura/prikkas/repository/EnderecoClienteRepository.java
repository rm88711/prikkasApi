package br.com.alura.prikkas.repository;

import br.com.alura.prikkas.model.EnderecoCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoClienteRepository extends JpaRepository<EnderecoCliente, Long> {

}