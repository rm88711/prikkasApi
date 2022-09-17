package br.com.alura.prikkas.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="T_PR_TIPO_PAGTO")
@SequenceGenerator(name="pagamento", sequenceName = "SQ_PR_TIPO_PAGTO", allocationSize = 1)
public class TipoPagamento {

    @Id
    @GeneratedValue(generator = "pagamento", strategy = GenerationType.SEQUENCE)
    @Column(name="ID_TP_PAGTO")
    private Long idPagamento;

    @Column(name = "DS_TP_PAGTO" , length = 30 , nullable = false)
    private String Descrição;


    public TipoPagamento() {
    }


    public TipoPagamento(String descrição) {
        Descrição = descrição;
    }

    public Long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String descrição) {
        Descrição = descrição.toUpperCase();
    }
}
