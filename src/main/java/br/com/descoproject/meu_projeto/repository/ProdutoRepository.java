package br.com.descoproject.meu_projeto.repository;

import br.com.descoproject.meu_projeto.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
