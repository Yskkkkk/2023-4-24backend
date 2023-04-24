package com.ysk.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ysk.mapper.StoreMapper;
import com.ysk.pojo.PageBean;
import com.ysk.pojo.Store;
import com.ysk.service.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StoreServiceImpl implements StoreService {


    @Autowired
    private StoreMapper storeMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize, String name, String address, Double size) {
        PageHelper.startPage(page,pageSize);

        List<Store> storeList = storeMapper.list(name,address,size);

        Page<Store> s = (Page<Store>) storeList;
        PageBean pageBean = new PageBean(s.getTotal(),s.getResult());
        return pageBean;
    }

    @Override
    public void save(Store store) {
        storeMapper.insert(store);
    }

    @Override
    public void delete(List<Integer> ids) {
        storeMapper.delete(ids);
    }

    @Override
    public Store getByStoreId(Integer id) {
        return storeMapper.getStuffById(id);
    }

    @Override
    public void update(Store store) {
        storeMapper.update(store);
    }


}
