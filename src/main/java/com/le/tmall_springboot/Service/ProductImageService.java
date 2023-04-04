package com.le.tmall_springboot.Service;

import com.le.tmall_springboot.pojo.Product;
import com.le.tmall_springboot.pojo.ProductImage;

import java.util.List;

public interface ProductImageService {
    public static final String type_single = "single";
    public static final String type_detail = "detail";
    void add(ProductImage bean);
    void delete(int id);
    ProductImage get(int id);
    List<ProductImage> listSingleProductImages(Product product);
    List<ProductImage> listDetailProductImages(Product product);
    void setFirstProdutImage(Product product);
    void setFirstProdutImages(List<Product> products);
}
