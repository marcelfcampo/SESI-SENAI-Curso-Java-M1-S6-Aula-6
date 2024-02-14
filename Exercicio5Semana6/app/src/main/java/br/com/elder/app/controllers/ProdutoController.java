package br.com.elder.app.controllers;

import br.com.elder.app.models.Categoria;
import br.com.elder.app.models.Produto;
import br.com.elder.app.services.CategoriaService;
import br.com.elder.app.services.ProdutoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/produtos")
public class ProdutoController {

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> save(
            @RequestParam("nome") String nome,
            @RequestParam("preco") Double preco,
            @RequestParam("categoriaId") Long categoriaId
    ) {

        Optional<Categoria> categoria = categoriaService.findById(categoriaId);

        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setCategoria(categoria.get());

        return ResponseEntity.ok().body(produtoService.save(produto));
    }


}
