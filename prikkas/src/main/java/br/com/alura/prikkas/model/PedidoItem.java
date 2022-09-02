package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name = "T_PR_PEDIDO_ITEM")
public class PedidoItem {

    @Id
    @Column(name = "ID_PEDIDO_ITEM")
    private Long idPedidoItem;

    @Column(name = "ID_PEDIDO")
    private Long idPedido;

    @Column(name = "ID_CARDAPIO")
    private Long idCardapio;

    public PedidoItem() {
    }

    public PedidoItem(Long idPedidoItem, Long idPedido, Long idCardapio) {
        this.idPedidoItem = idPedidoItem;
        this.idPedido = idPedido;
        this.idCardapio = idCardapio;
    }

    public Long getIdPedidoItem() {
        return idPedidoItem;
    }

    public void setIdPedidoItem(Long idPedidoItem) {
        this.idPedidoItem = idPedidoItem;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Long getIdCardapio() {
        return idCardapio;
    }

    public void setIdCardapio(Long idCardapio) {
        this.idCardapio = idCardapio;
    }
}
