package com.wualtervera.inventory.controller;

import com.wualtervera.inventory.model.Product;
import com.wualtervera.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;


    @GetMapping
    public Flux<Product> getAllProductos() {
        return productService.getAllProductos();
    }

    @GetMapping("/{id}")
    public Mono<Product> getProductoById(@PathVariable String id) {
        return productService.getProductoById(id);
    }

    @PostMapping
    public Mono<Product> createProducto(@RequestBody Product product) {
        return productService.createProducto(product);
    }

    @PutMapping("/{id}")
    public Mono<Product> updateProducto(@PathVariable String id, @RequestBody Product product) {
        return productService.updateProducto(id, product);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteProducto(@PathVariable String id) {
        return productService.deleteProducto(id);
    }
}
