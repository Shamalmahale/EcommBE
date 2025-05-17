package com.shamal.Ecomm.repo;

import com.shamal.Ecomm.model.Product;
import com.shamal.Ecomm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
