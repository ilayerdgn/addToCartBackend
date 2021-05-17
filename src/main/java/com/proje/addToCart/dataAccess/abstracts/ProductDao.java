package com.proje.addToCart.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import com.proje.addToCart.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{

}
