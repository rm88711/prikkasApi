package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name = "T_PR_END_REST")
@SequenceGenerator(name = "enderec",sequenceName = "SQ_PR_ENDERECO", allocationSize = 1)
public class EnderecoRestaurante {
    @Id
    @Column(name = "ID_ENDERECO", nullable = false, length = 10)
    private Long idEnredeco;

    @Column(name="ID_RESTAURANTE ", nullable = false, length = 10)
    private Long idRetaurent;

    public EnderecoRestaurante() {
    }

    public EnderecoRestaurante(Long idEnredeco, Long idRetaurent) {
        this.idEnredeco = idEnredeco;
        this.idRetaurent = idRetaurent;
    }

    public Long getIdEnredeco() {
        return idEnredeco;
    }

    public void setIdEnredeco(Long idEnredeco) {
        this.idEnredeco = idEnredeco;
    }

    public Long getIdRetaurent() {
        return idRetaurent;
    }

    public void setIdRetaurent(Long idRetaurent) {
        this.idRetaurent = idRetaurent;
    }
}
