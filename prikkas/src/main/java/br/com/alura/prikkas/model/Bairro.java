package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name = "T_PR_BAIRRO")
@SequenceGenerator(name = "bairr",sequenceName = "SQ_PR_BAIRRO", allocationSize = 1)

public class Bairro {

    @Id
    @Column(name = "ID_BAIRRO")
    @GeneratedValue(generator = "bairr",strategy = GenerationType.SEQUENCE)
    private Long idBairro;

    @Column(name = "ID_CIDADE" , length = 10)
    private Long idCidade;

    @Column(name = "NM_BAIRRO", length = 100)
    private String nome;

    public Bairro() {
    }

    public Bairro(Long idCidade, String nome) {
        this.idCidade = idCidade;
        this.nome = nome;
    }

    public Long getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(Long idBairro) {
        this.idBairro = idBairro;
    }

    public Long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
