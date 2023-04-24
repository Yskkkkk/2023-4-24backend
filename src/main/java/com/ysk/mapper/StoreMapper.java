package com.ysk.mapper;

import com.ysk.pojo.Store;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StoreMapper {

    public List<Store> list(String name,String address,Double size);

    @Insert("insert into store(name,address,size) value (#{name},#{address},#{size})")
    public void insert(Store store);

    public void delete(List<Integer> ids);

    @Select("select * from store where id =#{id}")
    public Store getStuffById(Integer id);

    public void update(Store store);


}
