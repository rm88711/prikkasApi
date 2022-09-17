package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name = "T_PR_RESTAURANTE")
@SequenceGenerator(name = "restaurante",sequenceName = "SQ_PR_RESTAURANTE", allocationSize = 1)
public class Restaurante {

    @Id
    @Column(name="ID_RESTAURANTE")
    @GeneratedValue(generator = "restaurante", strategy = GenerationType.SEQUENCE)
    private Long IdRestaurante;

    @Column(name="NM_RESTAURANTE", nullable = false, length = 50)
    private String nomeRestaurante;

    @Column(name="NR_CNPJ_REST", nullable = false, length = 18)
    private  String CNPJ;

    @Column(name="DS_EMAIL", nullable = false, length = 100)
    private String desEmail;

    public Restaurante() {
    }

    public Restaurante(String nomeRestaurante, String CNPJ, String desEmail) {
        this.nomeRestaurante = nomeRestaurante;
        this.CNPJ = CNPJ;
        this.desEmail = desEmail;
    }

    public Long getIdRestaurante() {
        return IdRestaurante;
    }

    public void setIdRestaurante(Long idRestaurante) {
        IdRestaurante = idRestaurante;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getDesEmail() {
        return desEmail;
    }

    public void setDesEmail(String desEmail) {
        this.desEmail = desEmail;
    }
}
