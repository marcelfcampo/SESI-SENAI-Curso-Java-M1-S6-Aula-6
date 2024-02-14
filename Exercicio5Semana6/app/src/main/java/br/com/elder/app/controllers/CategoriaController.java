package br.com.elder.app.controllers;

import br.com.elder.app.models.Categoria;
import br.com.elder.app.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public Categoria save(
            @RequestParam("nome") String nome
    ) {
        Categoria categoria = new Categoria();
        categoria.setNome(nome);
        return ResponseEntity.ok().body(categoriaService.save(categoria)).getBody();
    }
}
