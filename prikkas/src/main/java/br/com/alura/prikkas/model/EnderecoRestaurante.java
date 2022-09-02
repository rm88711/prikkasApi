package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name = "T_PR_END_REST")
@SequenceGenerator(name = "enderec",sequenceName = "SQ_PR_ENDERECO", allocationSize = 1)
public class EnderecoRestaurante {
    @Id
    @Column(name = "ID_END_REST")
    @GeneratedValue(generator = "enderec",strategy = GenerationType.SEQUENCE)
    private Long idEnredeco;

    @Column(name="ID_RESTAURANTE ", nullable = false, length = 10)
    private Long idRetaurent;

    @Column(name="DS_LOGRADOURO", nullable = false, length = 80)
    private String logradouro;

    @Column(name="NM_BAIRRO", nullable = false, length = 30)
    private String bairro;

    @Column(name="NM_CIDADE", nullable = false, length = 20)
    private String cidade;

    @Column(name="NM_ESTADO", nullable = false, length = 30)
    private String estado;

    @Column(name="SG_ESTADO", nullable = false, length = 2)
    private String siglaEstado;

    public EnderecoRestaurante() {
    }

    public EnderecoRestaurante( Long idRetaurent, String logradouro, String bairro, String cidade, String estado, String siglaEstado) {
        this.idRetaurent = idRetaurent;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.siglaEstado = siglaEstado;
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

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }
}
