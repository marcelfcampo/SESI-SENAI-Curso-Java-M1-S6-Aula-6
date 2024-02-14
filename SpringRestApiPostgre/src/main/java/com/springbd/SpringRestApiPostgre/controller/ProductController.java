package com.springbd.SpringRestApiPostgre.controller;

import com.springbd.SpringRestApiPostgre.model.Product;
import com.springbd.SpringRestApiPostgre.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/products")

    public class ProductController {
        @Autowired
        private ProductService productService;

        @GetMapping
        public ResponseEntity<List<Product>> findAll() {

            //Verificação se comunicação está OK e busca por todos os produtos.
            return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());


        }

        @GetMapping("/{id}")

        public ResponseEntity<Optional<Product>> findById(@PathVariable Long id) {
            //Verificação se comunicação está OK e busca por um único produto.
            return ResponseEntity.status(HttpStatus.OK).body(productService.findById(id));
        }

        @PostMapping
        public ResponseEntity<Product> create(@RequestBody Product product) {
            //Verificar se o método foi criado.
            //Invocar o método save, responsável por salvar.
            return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
        }
         @PutMapping
         public ResponseEntity<Product> update(@RequestBody Product product) {
             //alterar produto
             return ResponseEntity.status(HttpStatus.OK).body(productService.update(product));

         }

          @DeleteMapping("/{id}")
          public ResponseEntity<?> delete(@PathVariable Long id) {
              //Invocando o método ById, passando o id por paramêtro e retornando deletado.
              productService.deleteById(id);
              return ResponseEntity.status(HttpStatus.OK).build();
          }


    }


