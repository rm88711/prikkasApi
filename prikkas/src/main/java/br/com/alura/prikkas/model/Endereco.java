package br.com.alura.prikkas.model;


import javax.persistence.*;

@Entity
@Table(name="T_PR_ENDERECO")
@SequenceGenerator(name="endereco", sequenceName = "SQ_PR_ENDERECO", allocationSize = 1)
public class Endereco {

    @Id
    @Column(name="ID_ESTADO")
    @GeneratedValue(generator = "endereco", strategy = GenerationType.SEQUENCE)
    private Long idEstado;

    @Column(name="NM_ESTADO", nullable = false, length = 20)
    private String estado;

    @Column(name="SG_ESTADO", nullable = false, length = 20)
    private String siglaEstado;

    @Column(name="DS_LOGRADOURO", nullable = false, length = 80)
    private String logradouro;

    @Column(name="NM_BAIRRO", nullable = false, length = 30)
    private String bairro;

    @Column(name="NM_CIDADE", nullable = false, length = 20)
    private String cidade;

    @Column(name="DS_ENDERECO", nullable = false, length = 20)
    private String descricaoEndereco;

    public Endereco() {
    }

    public Endereco(String estado, String siglaEstado, String logradouro, String bairro, String cidade, String descricaoEndereco) {
        this.estado = estado;
        this.siglaEstado = siglaEstado;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.descricaoEndereco = descricaoEndereco;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
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

    public String getDescricaoEndereco() {
        return descricaoEndereco;
    }

    public void setDescricaoEndereco(String descricaoEndereco) {
        this.descricaoEndereco = descricaoEndereco;
    }
}
