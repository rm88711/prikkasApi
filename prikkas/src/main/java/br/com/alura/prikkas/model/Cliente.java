package br.com.alura.prikkas.model;
import javax.persistence.*;

@Entity
@Table(name="T_PR_CLIENTE")
@SequenceGenerator(name="cliente", sequenceName = "SQ_T_PR_CLIENTE", allocationSize = 1)
public class Cliente {

    @Id
    @Column(name=" ID_CLIENTE ")
    @GeneratedValue(generator = "cliente", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="NM_CLIENTE", nullable = false, length = 150)
    private String nome;

    @Column(name="NR_CPF", nullable = false, length = 20)
    private Long cpf;

    @Column(name="DS_EMAIL", nullable = false, length = 200)
    private String email;

    public Cliente(String nome, Long cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
