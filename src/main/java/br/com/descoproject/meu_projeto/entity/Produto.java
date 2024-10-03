package br.com.descoproject.meu_projeto.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer produtoId;
    @Column(name = "produto_nome")
    private String produtoNome;
    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
    @JsonBackReference
    private Categoria categoria;

    @ManyToMany
    @JoinTable(name = "categoria_id", joinColumns = @JoinColumn(name = "produto_id"),
            inverseJoinColumns = @JoinColumn(name = "pedido_id"))
    Set<Pedido> pedidos;

    public Produto(Integer produtoId, String produtoNome, Categoria categoria, Set<Pedido> pedidos) {
        this.produtoId = produtoId;
        this.produtoNome = produtoNome;
        this.categoria = categoria;
        this.pedidos = pedidos;
    }

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "produtoId=" + produtoId +
                ", produtoNome='" + produtoNome + '\'' +
                ", categoria=" + categoria +
                ", pedidos=" + pedidos +
                '}';
    }
}
