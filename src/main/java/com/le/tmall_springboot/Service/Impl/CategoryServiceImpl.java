package com.le.tmall_springboot.Service.Impl;

import com.le.tmall_springboot.Service.CategoryService;
import com.le.tmall_springboot.mapper.CategoryMapper;
import com.le.tmall_springboot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }
}
