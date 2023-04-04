package com.le.tmall_springboot.Dao;

import java.util.List;

import com.le.tmall_springboot.pojo.Product;
import com.le.tmall_springboot.pojo.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductImageDAO extends JpaRepository<ProductImage,Integer> {
    public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);
}

