package com.le.tmall_springboot.Dao;

import java.util.List;

import com.le.tmall_springboot.pojo.Category;
import com.le.tmall_springboot.pojo.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyDAO extends JpaRepository<Property,Integer>{
    Page<Property> findByCategory(Category category, Pageable pageable);
}