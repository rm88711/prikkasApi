package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name = "T_PR_TELEFONE")
@SequenceGenerator(name = "telefone",sequenceName = "SQ_PR_TELEFONE", allocationSize = 1)
public class Telefone {

    @Id
    @GeneratedValue(generator = "telefone", strategy = GenerationType.SEQUENCE)
    private Long idTelefone;

    @Column(name="NR_TELEFONE", nullable = false, length = 9)
    private Long nrTelefone;

    @Column(name="NR_DDD", nullable = false, length = 3)
    private Long nrDDD;

    @Column(name="NR_DDI", nullable = false, length = 3)
    private Long nrDDI;

    @Column(name="DS_TELEFONE", nullable = false, length = 3)
    private String descricao;

    public Telefone() {
    }

    public Telefone(Long nrTelefone, Long nrDDD, Long nrDDI, String descricao) {
        this.nrTelefone = nrTelefone;
        this.nrDDD = nrDDD;
        this.nrDDI = nrDDI;
        this.descricao = descricao;
    }

    public Long getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(Long idTelefone) {
        this.idTelefone = idTelefone;
    }

    public Long getNrTelefone() {
        return nrTelefone;
    }

    public void setNrTelefone(Long nrTelefone) {
        this.nrTelefone = nrTelefone;
    }

    public Long getNrDDD() {
        return nrDDD;
    }

    public void setNrDDD(Long nrDDD) {
        this.nrDDD = nrDDD;
    }

    public Long getNrDDI() {
        return nrDDI;
    }

    public void setNrDDI(Long nrDDI) {
        this.nrDDI = nrDDI;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
