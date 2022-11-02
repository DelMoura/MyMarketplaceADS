package com.ads.MyMarketplace.Repository;

import com.ads.MyMarketplace.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByNameOrTipo(String name, String tipo);


}