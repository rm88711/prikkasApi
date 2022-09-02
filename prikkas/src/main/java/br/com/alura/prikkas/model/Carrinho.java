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

    @Column(name="ID_PEDIDO ", nullable = false, length = 10)
    private Long idPedido;

    @Column(name=" DS_PAGAMENTO ", nullable = false, length = 15)
    private String pagamento;

    public Carrinho(Long idPedido, String pagamento) {
        this.idPedido = idPedido;
        this.pagamento = pagamento;
    }

    public Carrinho() {
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
}
