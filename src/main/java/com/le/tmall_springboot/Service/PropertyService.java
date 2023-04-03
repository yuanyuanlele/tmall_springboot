package com.le.tmall_springboot.Service;

import com.le.tmall_springboot.pojo.Property;
import com.le.tmall_springboot.utils.Page4Navigator;

public interface PropertyService {
    Page4Navigator<Property> list(int cid, int start, int size, int i);
    void update(Property bean);
    Property get(int id);
    void delete(int id);
    void add(Property bean);
}
