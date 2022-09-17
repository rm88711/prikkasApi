package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name = "T_PR_TEL_CLIENTE")
public class TelefoneCliente {

    @Id
    @Column(name="ID_TELEFONE")
    private Long idTel;

    @Column(name="ID_CLIENTE", nullable = false)
    private Long id;


    public TelefoneCliente() {
    }

    public TelefoneCliente(Long idTel, Long id) {
        this.idTel = idTel;
        this.id = id;
    }

    public Long getIdTel() {
        return idTel;
    }

    public void setIdTel(Long idTel) {
        this.idTel = idTel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
