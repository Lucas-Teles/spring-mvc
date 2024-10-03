package br.com.descoproject.meu_projeto.repository;

import br.com.descoproject.meu_projeto.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
