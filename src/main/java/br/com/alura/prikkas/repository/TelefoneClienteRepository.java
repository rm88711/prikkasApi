package br.com.alura.prikkas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alura.prikkas.model.TelefoneCliente;
public interface TelefoneClienteRepository extends JpaRepository<TelefoneCliente, Long> {}
