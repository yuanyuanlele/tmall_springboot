package com.le.tmall_springboot.Service;

import com.le.tmall_springboot.pojo.Category;

import java.util.List;

public interface CategoryService {
    List<Category> list();
    void add(Category category);
}
