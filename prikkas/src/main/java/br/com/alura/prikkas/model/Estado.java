package br.com.alura.prikkas.model;


import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "T_PR_ESTADO")
@SequenceGenerator(name = "estado",sequenceName = "SQ_PR_TELEFONE", allocationSize = 1)
public class Estado {

    @Id
    @GeneratedValue(generator = "estado" , strategy = GenerationType.SEQUENCE)
    private Long idEstado;

    @Column(name = "NM_ESTADO" , nullable = false, length = 100)
    private String nome;

    @Column(name = "SG_ESTADO",nullable = false,length = 2)
    private String sigle;

    public Estado() {
    }

    public Estado(String nome, String sigle) {
        this.nome = nome;
        this.sigle = sigle;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }
}
