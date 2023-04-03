package com.le.tmall_springboot.Service.Impl;

import com.le.tmall_springboot.Dao.PropertyDAO;
import com.le.tmall_springboot.Service.CategoryService;
import com.le.tmall_springboot.Service.PropertyService;
import com.le.tmall_springboot.pojo.Category;
import com.le.tmall_springboot.pojo.Property;
import com.le.tmall_springboot.utils.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    PropertyDAO propertyDAO;
    @Autowired
    CategoryService categoryService;

    public void add(Property bean){
        propertyDAO.save(bean);
    }

    public void delete(int id){
        propertyDAO.deleteById(id);
    }

    public Property get(int id){
        Property property=propertyDAO.findById(id).get();
        return property;
    }

    public void update(Property bean){
        propertyDAO.save(bean);
    }

    public Page4Navigator<Property> list(int cid, int start, int size, int navigatePages){
        Category category= categoryService.get(cid);
        Sort sort= Sort.by(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(start, size, sort);
        Page<Property> pageFromJPA =propertyDAO.findByCategory(category,pageable);
        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }
}
