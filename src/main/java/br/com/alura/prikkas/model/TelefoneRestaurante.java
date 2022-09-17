package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name = "T_PR_TEL_REST")
public class TelefoneRestaurante {

    @Id
    @Column(name = "ID_TELEFONE")
    private Long idTel;

    @Column(name = "ID_RESTAURANTE")
    private Long idRest;

    public TelefoneRestaurante() {
    }

    public TelefoneRestaurante(Long idTel, Long idRest) {
        this.idTel = idTel;
        this.idRest = idRest;
    }

    public Long getIdTel() {
        return idTel;
    }

    public void setIdTel(Long idTel) {
        this.idTel = idTel;
    }

    public Long getIdRest() {
        return idRest;
    }

    public void setIdRest(Long idRest) {
        this.idRest = idRest;
    }
}
