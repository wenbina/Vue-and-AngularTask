package com.wenbin.vueshop.entity;


public class Shopcar {

  private int cid;
  private String shopname;
  private double shopprice;
  private int shopsum;

  public Shopcar() {  }

  public Shopcar(String shopname, double shopprice, int shopsum) {
    this.shopname = shopname;
    this.shopprice = shopprice;
    this.shopsum = shopsum;
  }

  public Shopcar(int cid, String shopname, double shopprice, int shopsum) {
    this.cid = cid;
    this.shopname = shopname;
    this.shopprice = shopprice;
    this.shopsum = shopsum;
  }

  public int getCid() {
    return cid;
  }

  public void setCid(int cid) {
    this.cid = cid;
  }


  public String getShopname() {
    return shopname;
  }

  public void setShopname(String shopname) {
    this.shopname = shopname;
  }


  public double getShopprice() {
    return shopprice;
  }

  public void setShopprice(double shopprice) {
    this.shopprice = shopprice;
  }


  public int getShopsum() {
    return shopsum;
  }

  public void setShopsum(int shopsum) {
    this.shopsum = shopsum;
  }

}
