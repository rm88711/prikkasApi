package br.com.alura.prikkas.model;

import javax.persistence.*;

@Entity
@Table(name = "T_PR_CARDAPIO")
@SequenceGenerator(name = "cardapio",sequenceName = "SQ_PR_CARDAPIO", allocationSize = 1)
public class Cardapio {

    @Id
    @Column(name="ID_CARDAPIO")
    @GeneratedValue(generator = "cardapio", strategy = GenerationType.SEQUENCE)
    private Long idCardapio;

    @Column(name="ID_RESTAURANTE ", nullable = false, length = 10)
    private Long idRetaurent;

    @Column(name="NM_ITEM_CARDAPIO", nullable = false, length = 30)
    private String nomeItem;

    @Column(name="VL_ITEM_CARDAPIO", nullable = false, length = 20)
    private Long preco;

    @Column(name="DS_ITEM_CARDAPIO", nullable = false, length = 20)
    private String descricao;

    @Column(name="FT_FOTO", nullable = false, length = 20)
    private byte[] foto;

    public Cardapio() {
    }

    public Cardapio( Long idRetaurent, String nomeItem, Long preco, String descricao, byte[] foto) {
        this.idRetaurent = idRetaurent;
        this.nomeItem = nomeItem;
        this.preco = preco;
        this.descricao = descricao;
        this.foto = foto;
    }

    public Long getIdCardapio() {
        return idCardapio;
    }

    public void setIdCardapio(Long idCardapio) {
        this.idCardapio = idCardapio;
    }

    public Long getIdRetaurent() {
        return idRetaurent;
    }

    public void setIdRetaurent(Long idRetaurent) {
        this.idRetaurent = idRetaurent;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public Long getPreco() {
        return preco;
    }

    public void setPreco(Long preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
