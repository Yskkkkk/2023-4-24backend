package com.ysk.controller;


import com.ysk.pojo.PageBean;
import com.ysk.pojo.Result;
import com.ysk.pojo.Store;
import com.ysk.service.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("/select")
    public PageBean page(@RequestParam(defaultValue = "1") Integer page,
                         @RequestParam(defaultValue = "5") Integer pageSize,
                         String name, String address, Double size){

        log.info("分页查询，参数：{},{},{},{},{}", page, pageSize,name,address,size);
        PageBean pageBean = storeService.page(page, pageSize,name,address,size);
        return pageBean;
    }

    @PostMapping("/add")
    public Result save(@RequestBody Store store){
        log.info("新增门店，stuff:{}",store);
        storeService.save(store);
        return Result.success();
    }


    //批量删除
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        storeService.delete(ids);
        return Result.success();
    }

    @GetMapping("/select/{id}")
    public Store getStoreById(@PathVariable Integer id) {
        // 在这里可以根据 userId 和 userName 进行身份验证或其他操作
        // 假设 userService 提供了获取用户信息的方法
        return storeService.getByStoreId(id);
    }

    @PutMapping("/update/{id}")
    public Result update(@PathVariable("id") Integer id,@RequestBody Store store){
        Store existingEmp = storeService.getByStoreId(id);
        if (existingEmp != null) {
            existingEmp.setName(store.getName());
            existingEmp.setAddress(store.getAddress());
            existingEmp.setSize(store.getSize());

            storeService.update(existingEmp);
            return Result.success();
        } else {
            return Result.error("门店信息不存在");
        }
    }

    @GetMapping("/data")
    public Store getDataByStore(@RequestParam("id") Integer id){
            return storeService.getByStoreId(id);
    }
}
