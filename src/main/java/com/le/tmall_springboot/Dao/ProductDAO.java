package com.le.tmall_springboot.Dao;

import com.le.tmall_springboot.pojo.Category;
import com.le.tmall_springboot.pojo.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product,Integer> {
    Page<Product> findByCategory(Category category, Pageable pageable);
}
