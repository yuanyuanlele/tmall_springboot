package com.le.tmall_springboot.Service;

import com.le.tmall_springboot.pojo.Category;

import com.le.tmall_springboot.utils.Page4Navigator;

import java.util.List;

public interface CategoryService {
    void add(Category bean);
    List<Category> list();
    Page4Navigator<Category> list(int start, int size, int navigatePages);
    void delete(int id);
    Category get(int id);
    void update(Category bean);
}
