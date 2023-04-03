package com.le.tmall_springboot.Service.Impl;

import com.le.tmall_springboot.Dao.CategoryDAO;
import com.le.tmall_springboot.Service.CategoryService;
import com.le.tmall_springboot.pojo.Category;
import com.le.tmall_springboot.utils.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDAO categoryDAO;

    public void add(Category bean) {
        categoryDAO.save(bean);
    }

    public Page4Navigator<Category> list(int start, int size, int navigatePages) {
        Sort sort =Sort.by(Sort.Direction.DESC, "id");
        Pageable pageable =PageRequest.of(start, size,sort);
        Page pageFromJPA =categoryDAO.findAll(pageable);

        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }
    public List<Category> list() {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        return categoryDAO.findAll(sort);
    }

    public void delete(int id) {
        categoryDAO.deleteById(id);
    }

    public Category get(int id) {
        Category c= categoryDAO.findById(id).get();
        return c;
    }

    @Override
    public void update(Category bean) {
        categoryDAO.save(bean);
    }
}
