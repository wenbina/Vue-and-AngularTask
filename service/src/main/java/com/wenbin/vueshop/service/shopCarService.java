package com.wenbin.vueshop.service;

import com.wenbin.vueshop.entity.Shopcar;

import java.util.List;

public interface shopCarService {
    //select
    List<Shopcar> getAll();
    //insert
    int insertShop(Shopcar shopcar);
    //update
    int updateShop(Shopcar shopcar);
    //delete
    int deleteShop(int cid);
    //update shopsum
    int updateSum(int shopsum,int cid);
}
