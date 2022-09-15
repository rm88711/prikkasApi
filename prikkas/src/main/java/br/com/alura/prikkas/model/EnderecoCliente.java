package br.com.alura.prikkas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_PR_END_CLIENTE")
public class EnderecoCliente {

    @Id
    @Column(name = "ID_CLIENTE")
    private Long idCliente;

    @Column(name = "ID_ENDERECO")
    private Long idEndereco;

    public EnderecoCliente() {
    }

    public EnderecoCliente(Long idCliente, Long idEndereco) {
        this.idCliente = idCliente;
        this.idEndereco = idEndereco;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }
}
