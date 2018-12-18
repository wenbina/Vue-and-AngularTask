package com.wenbin.vueshop.controller;

import com.wenbin.vueshop.entity.Shopcar;
import com.wenbin.vueshop.service.shopCarService;
import com.wenbin.vueshop.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@RequestMapping("/ShopApi")
public class shopCarController {

    @Autowired
    shopCarService service;

    //select
    @RequestMapping("getAll")
    @ResponseBody
    public R getAll(){
        return R.ok(service.getAll());
    }

    //insert
    @RequestMapping("insertShop")
    @ResponseBody
    public int insertShop(Shopcar shopcar){
        return service.insertShop(shopcar);
    }

    //update
    @RequestMapping("updateShop")
    @ResponseBody
    public int updateSHop(Shopcar shopcar){
        return service.updateShop(shopcar);
    }

    //delete
    @RequestMapping("deleteShop")
    @ResponseBody
    public int deleteShop(Integer cid){
        return service.deleteShop(cid);
    }

    //update shopsum
    @RequestMapping("updateSum")
    @ResponseBody
    public int updateSum(Integer shopsum,Integer cid){
        System.out.println("sum:"+shopsum+",id:"+cid);
        return service.updateSum(shopsum,cid);
    }
}
