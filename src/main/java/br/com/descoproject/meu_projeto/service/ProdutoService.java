package br.com.descoproject.meu_projeto.service;

import br.com.descoproject.meu_projeto.entity.Categoria;
import br.com.descoproject.meu_projeto.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public List<Categoria> getAll(){
        return categoriaRepository.findAll();
    }

    public Categoria getById(Integer id){
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria saveCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public Categoria updateCategoria(Integer id, Categoria categoria){
        Categoria categoriaAtualizada = categoriaRepository.findById(id).orElse(null);
        if (categoria != null){
            categoriaRepository.delete(categoria);
            return categoriaRepository.save(categoriaAtualizada);
        }else {
            return null;
        }
    }

    public Boolean deleteCategoria(Integer id){
        Categoria categoria = categoriaRepository.findById(id).orElse(null);
        if (categoria != null){
            categoriaRepository.delete(categoria);
            return true;
        }else {
            return false;
        }
    }
}
