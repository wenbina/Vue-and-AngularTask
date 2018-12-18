package com.wenbin.vueshop.dao;

import com.wenbin.vueshop.entity.Shopcar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface shopCarDao {
    //select
    List<Shopcar> getAll();
    //insert
    int insertShop(Shopcar shopcar);
    //update
    int updateShop(Shopcar shopcar);
    //delete
    int deleteShop(int cid);
    //update shopsum
    int updateSum(@Param("shopsum") int shopsum,@Param("cid") int cid);
}
