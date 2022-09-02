package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name = "T_PR_TEL_REST")
@SequenceGenerator(name = "telrest",sequenceName = "SQ_PR_TELEFONE", allocationSize = 1)
public class TelefoneRestaurante {

    @Id
    @Column(name = "ID_TEL_REST")
    @GeneratedValue(generator = "telrest",strategy = GenerationType.SEQUENCE)
    private Long idTelRest;

    @Column(name="ID_RESTAURANTE ", nullable = false, length = 10)
    private Long idRetaurent;

    @Column(name="NR_TELEFONE", nullable = false, length = 9)
    private Long telefone;

    @Column(name="NR_DDD", nullable = false, length = 3)
    private Long ddd;

    @Column(name="DS_TELEFONE", nullable = false, length = 15)
    private String email;

    public TelefoneRestaurante(Long idRetaurent, Long telefone, Long ddd, String email) {
        this.idRetaurent = idRetaurent;
        this.telefone = telefone;
        this.ddd = ddd;
        this.email = email;
    }

    public TelefoneRestaurante() {
    }

    public Long getIdTelRest() {
        return idTelRest;
    }

    public void setIdTelRest(Long idTelRest) {
        this.idTelRest = idTelRest;
    }

    public Long getIdRetaurent() {
        return idRetaurent;
    }

    public void setIdRetaurent(Long idRetaurent) {
        this.idRetaurent = idRetaurent;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Long getDdd() {
        return ddd;
    }

    public void setDdd(Long ddd) {
        this.ddd = ddd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
