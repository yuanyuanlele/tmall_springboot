package com.le.tmall_springboot.Service;

import com.le.tmall_springboot.pojo.Product;
import com.le.tmall_springboot.utils.Page4Navigator;

public interface ProductService {
    void add(Product bean);
    void delete(int id);
    Product get(int id);
    void update(Product bean);
    Page4Navigator<Product> list(int cid, int start, int size, int navigatePages);
}
