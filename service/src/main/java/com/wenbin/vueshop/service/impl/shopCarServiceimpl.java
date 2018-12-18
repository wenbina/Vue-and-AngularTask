package com.wenbin.vueshop.service.impl;

import com.wenbin.vueshop.dao.shopCarDao;
import com.wenbin.vueshop.entity.Shopcar;
import com.wenbin.vueshop.service.shopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class shopCarServiceimpl implements shopCarService {

    @Autowired
    shopCarDao dao;

    //select
    public List<Shopcar> getAll() {
        return dao.getAll();
    }

    //insert
    public int insertShop(Shopcar shopcar) {
        return dao.insertShop(shopcar);
    }

    //update
    public int updateShop(Shopcar shopcar) {
        return dao.updateShop(shopcar);
    }

    //delete
    public int deleteShop(int cid) {
        return dao.deleteShop(cid);
    }

    //update shopsum
    public int updateSum(int shopsum, int cid) {
        return dao.updateSum(shopsum,cid);
    }
}
