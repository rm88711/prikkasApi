package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name="T_PR_CARRINHO")
@SequenceGenerator(name="carrinho", sequenceName = "SQ_PR_CARRINHO", allocationSize = 1)
public class Carrinho {

    @Id
    @GeneratedValue(generator = "carrinho",strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_PAGAMENTO")
    private Long idPagamento;

    @Column(name="NR_PEDIDO", nullable = false, length = 10)
    private Long idPedido;

    @Column(name="ID_CLIENTE", nullable = false, length = 15)
    private String pagamento;

    @Column(name="ID_ENDERECO", nullable = false, length = 10)
    private String idEndereco;

    @Column(name="ID_TP_PAGTO", nullable = false, length = 10)
    //@ManyToOne
    //@JoinColumn(name = "ID_TP_PAGTO" ,nullable = false)
    private String tpPagamento;

    public Carrinho() {
    }

    public Carrinho( String pagamento, String idEndereco, String tpPagamento) {
       // this.idPedido = idPedido;
        this.pagamento = pagamento;
        this.idEndereco = idEndereco;
        this.tpPagamento = tpPagamento;
    }

    public Long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(String idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getTpPagamento() {
        return tpPagamento;
    }

    public void setTpPagamento(String tpPagamento) {
        this.tpPagamento = tpPagamento;
    }
}
