package com.rakib.productserivce.repository;

import com.rakib.productserivce.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
