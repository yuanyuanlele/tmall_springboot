package com.le.tmall_springboot.mapper;

import com.le.tmall_springboot.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface CategoryMapper {
    List<Category> list();

    int add(Category category);
}
