package br.com.descoproject.meu_projeto.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoriaId;
    @Column(name = "categoria_nome")
    private String categoriaNome;
    @OneToMany(mappedBy = "categoria")
    @JsonManagedReference
    private List<Produto> produtoList;

    public Categoria(Integer categoriaId, String categoriaNome, List<Produto> produtoList) {
        this.categoriaId = categoriaId;
        this.categoriaNome = categoriaNome;
        this.produtoList = produtoList;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getCategoriaNome() {
        return categoriaNome;
    }

    public void setCategoriaNome(String categoriaNome) {
        this.categoriaNome = categoriaNome;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "categoriaId=" + categoriaId +
                ", categoriaNome='" + categoriaNome + '\'' +
                ", produtoList=" + produtoList +
                '}';
    }
}
