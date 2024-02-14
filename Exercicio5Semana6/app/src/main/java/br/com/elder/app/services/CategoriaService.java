package br.com.elder.app.services;

import br.com.elder.app.models.Categoria;
import br.com.elder.app.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria save(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public Optional<Categoria> findById(Long id){
        return categoriaRepository.findById(id);
    }

}
