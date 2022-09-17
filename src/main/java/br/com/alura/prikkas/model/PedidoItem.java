package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name = "T_PR_PEDIDO_ITEM")
public class PedidoItem {

    //@Id
//    @Column(name = "ID_PEDIDO_ITEM")
//    private Long idPedidoItem;

    @Id
    @Column(name = "NR_PEDIDO")
    private Long idPedido;

    @Column(name = "ID_CARDAPIO")
    private Long idCardapio;

    @Column(name = "ID_CLIENTE")
    private Long idCliente;

    @Column(name = "ID_ENDERECO")
    private Long idEndereco;
    public PedidoItem() {
    }

    public PedidoItem(Long idPedido, Long idCardapio, Long idCliente, Long idEndereco) {
        this.idPedido = idPedido;
        this.idCardapio = idCardapio;
        this.idCliente = idCliente;
        this.idEndereco = idEndereco;
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

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }
}
