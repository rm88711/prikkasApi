package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name = "T_PR_TEL_CLIENTE")
@SequenceGenerator(name = "telCliente",sequenceName = "SQ_PR_TELEFONE", allocationSize = 1)
public class TelefoneCliente {
    @Id
    @Column(name="ID_TEL_CLIENTE")
    @GeneratedValue(generator = "telCliente", strategy = GenerationType.SEQUENCE)
    private Long idTel;

    @Column(name="ID_CLIENTE", nullable = false)
    private Long id;

    @Column(name="NR_TELEFONE", nullable = false, length = 9)
    private Long numeroTel;

    @Column(name="NR_DDD", nullable = false, length = 3)
    private Integer ddd;

    @Column(name="NR_DDI", nullable = false, length = 3)
    private Integer ddi;

    @Column(name="DS_TELEFONE", nullable = false, length = 15)
    private String telDescricao;

    public TelefoneCliente(Long id, Long numeroTel, Integer ddd, Integer ddi, String telDescricao) {
        this.id = id;
        this.numeroTel = numeroTel;
        this.ddd = ddd;
        this.ddi = ddi;
        this.telDescricao = telDescricao;
    }

    public TelefoneCliente() {
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

    public Long getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(Long numeroTel) {
        this.numeroTel = numeroTel;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getDdi() {
        return ddi;
    }

    public void setDdi(Integer ddi) {
        this.ddi = ddi;
    }

    public String getTelDescricao() {
        return telDescricao;
    }

    public void setTelDescricao(String telDescricao) {
        this.telDescricao = telDescricao;
    }
}
