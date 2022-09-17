package br.com.alura.prikkas.model;


import javax.persistence.*;

@Entity
@Table(name="T_PR_ENDERECO")
@SequenceGenerator(name="endereco", sequenceName = "SQ_PR_ENDERECO", allocationSize = 1)
public class Endereco {

    @Id
    @Column(name="ID_ENDERECO")
    @GeneratedValue(generator = "endereco", strategy = GenerationType.SEQUENCE)
    private Long idEndereco;


    @Column(name="NR_CEP", nullable = false, length = 20)
    private String cep;

    @Column(name="DS_LOGRADOURO", nullable = false, length = 80)
    private String logradouro;

    @Column(name="ID_BAIRRO", nullable = false, length = 30)
    private String bairro;

    public Endereco() {
    }

    public Endereco(String cep, String logradouro, String bairro) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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
}
