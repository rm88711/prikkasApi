package br.com.alura.prikkas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alura.prikkas.model.Pedido;
public interface PedidoRepository extends JpaRepository<Pedido, Long> {}
