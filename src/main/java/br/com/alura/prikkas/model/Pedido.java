package br.com.alura.prikkas.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_PR_PEDIDO")
@SequenceGenerator(name = "pedido",sequenceName = "SQ_PR_PEDIDO", allocationSize = 1)
public class Pedido {

    @Id
    @Column(name = "NR_PEDIDO")
    @GeneratedValue(generator = "pedido",strategy = GenerationType.SEQUENCE)
    private Long idPedido;

    @Column(name="ID_CLIENTE", nullable = false, length = 10)
    private Long idCliente;

    @Column(name="ID_ENDERECO", nullable = false, length = 10)
    private Long idEndereco;

    @Column(name="DT_PEDIDO")
    private Date dtPedido;

    @Column(name="VL_PEDIDO", nullable = false, length = 20)
    private Double vlPedido;

    @Column(name="DS_STATUS_PEDIDO ", nullable = false, length = 15)
    private String dsStatusPedido;

    public Pedido() {
    }

    public Pedido(Long idCliente, Long idEndereco, Date dtPedido, Double vlPedido, String dsStatusPedido) {
        this.idCliente = idCliente;
        this.idEndereco = idEndereco;
        this.dtPedido = dtPedido;
        this.vlPedido = vlPedido;
        this.dsStatusPedido = dsStatusPedido;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
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

    public Date getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(Date dtPedido) {
        this.dtPedido = dtPedido;
    }

    public Double getVlPedido() {
        return vlPedido;
    }

    public void setVlPedido(Double vlPedido) {
        this.vlPedido = vlPedido;
    }

    public String getDsStatusPedido() {
        return dsStatusPedido;
    }

    public void setDsStatusPedido(String dsStatusPedido) {
        this.dsStatusPedido = dsStatusPedido;
    }
}
