package com.wualtervera.inventory.repository;

import com.wualtervera.inventory.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
    Mono<Void> deleteById(String id);
}