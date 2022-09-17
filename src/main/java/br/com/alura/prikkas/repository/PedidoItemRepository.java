package br.com.alura.prikkas.repository;

import br.com.alura.prikkas.model.PedidoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Long> {}