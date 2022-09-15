package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name="T_PR_CIDADE")
@SequenceGenerator(name="cidad", sequenceName = "SQ_PR_CIDADE", allocationSize = 1)
public class Cidade {
    @Id
    @Column(name = "ID_CIDADE")
    @GeneratedValue(generator = "cidad" , strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "ID_ESTADO")
    private Long idEstado;

    @Column(name = "NM_CIDADE" )
    private String nome;

    public Cidade() {
    }

    public Cidade(Long idEstado, String nome) {
        this.idEstado = idEstado;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        this.nome = nome.toUpperCase();
    }
}
