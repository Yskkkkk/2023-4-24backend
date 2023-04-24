package com.ysk.service;

import com.ysk.pojo.PageBean;
import com.ysk.pojo.Store;
import com.ysk.pojo.PageBean;

import java.util.List;


public interface StoreService {

    //分页查询
    PageBean page(Integer page, Integer pageSize, String name, String address, Double size);

    //新增门店
    public void save(Store store);

    //删除门店
    public void delete(List<Integer> ids);

    public Store getByStoreId(Integer id);

    public void update(Store store);
}
