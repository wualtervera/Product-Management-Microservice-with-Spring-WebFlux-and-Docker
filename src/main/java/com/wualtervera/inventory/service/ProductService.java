package com.wualtervera.inventory.service;

import com.wualtervera.inventory.model.Product;
import com.wualtervera.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.wualtervera.inventory.util.Utils.generateProductCode;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Flux<Product> getAllProductos() {
        return productRepository.findAll();
    }

    public Mono<Product> getProductoById(String id) {
        return productRepository.findById(id);
    }

    public Mono<Product> createProducto(Product product) {

        if (product == null)
            return Mono.error(new ResponseStatusException(HttpStatus.BAD_REQUEST, "Request is null"));

        product.setId(generateProductCode(product.getName()));
        return productRepository.save(product);
    }

    public Mono<Product> updateProducto(String id, Product product) {
        return productRepository.findById(id)
            .flatMap(existingProduct -> {
                existingProduct.setName(product.getName());
                existingProduct.setPrice(product.getPrice());
                return productRepository.save(existingProduct);
            });
    }

    public Mono<Void> deleteProducto(String id) {
        return productRepository.deleteById(id);
    }
}
