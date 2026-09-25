package com.joaquin.curso.springboot.app.crudjpa.springbootcrudjpa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.joaquin.curso.springboot.app.crudjpa.springbootcrudjpa.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends CrudRepository<Product,Long>{

    @Query("")
    boolean existsByName(String name);

    boolean existsBySku(String sku);
}
