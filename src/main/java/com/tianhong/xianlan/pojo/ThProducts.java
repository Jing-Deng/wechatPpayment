package com.tianhong.xianlan.pojo;

import javax.persistence.*;

@Table(name = "th_products")
public class ThProducts {
    @Id
    private Integer id;

    private String title;

    private String picurl;

    private String listname;

    private String guige;

    private Integer price;

    private Integer stock;

    private String errdiqu;

    private Integer yunfeistyle;

    private String yunfeiprice;

    private Integer stockstyle;

    private String begintime;

    private Integer xiangou;

    private Integer basicsales;

    private Integer originalprice;

    private String createtime;

    private Integer sales;

    private String detailproduct;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return picurl
     */
    public String getPicurl() {
        return picurl;
    }

    /**
     * @param picurl
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    /**
     * @return listname
     */
    public String getListname() {
        return listname;
    }

    /**
     * @param listname
     */
    public void setListname(String listname) {
        this.listname = listname;
    }

    /**
     * @return guige
     */
    public String getGuige() {
        return guige;
    }

    /**
     * @param guige
     */
    public void setGuige(String guige) {
        this.guige = guige;
    }

    /**
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * @return stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * @param stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * @return errdiqu
     */
    public String getErrdiqu() {
        return errdiqu;
    }

    /**
     * @param errdiqu
     */
    public void setErrdiqu(String errdiqu) {
        this.errdiqu = errdiqu;
    }

    /**
     * @return yunfeistyle
     */
    public Integer getYunfeistyle() {
        return yunfeistyle;
    }

    /**
     * @param yunfeistyle
     */
    public void setYunfeistyle(Integer yunfeistyle) {
        this.yunfeistyle = yunfeistyle;
    }

    /**
     * @return yunfeiprice
     */
    public String getYunfeiprice() {
        return yunfeiprice;
    }

    /**
     * @param yunfeiprice
     */
    public void setYunfeiprice(String yunfeiprice) {
        this.yunfeiprice = yunfeiprice;
    }

    /**
     * @return stockstyle
     */
    public Integer getStockstyle() {
        return stockstyle;
    }

    /**
     * @param stockstyle
     */
    public void setStockstyle(Integer stockstyle) {
        this.stockstyle = stockstyle;
    }

    /**
     * @return begintime
     */
    public String getBegintime() {
        return begintime;
    }

    /**
     * @param begintime
     */
    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    /**
     * @return xiangou
     */
    public Integer getXiangou() {
        return xiangou;
    }

    /**
     * @param xiangou
     */
    public void setXiangou(Integer xiangou) {
        this.xiangou = xiangou;
    }

    /**
     * @return basicsales
     */
    public Integer getBasicsales() {
        return basicsales;
    }

    /**
     * @param basicsales
     */
    public void setBasicsales(Integer basicsales) {
        this.basicsales = basicsales;
    }

    /**
     * @return originalprice
     */
    public Integer getOriginalprice() {
        return originalprice;
    }

    /**
     * @param originalprice
     */
    public void setOriginalprice(Integer originalprice) {
        this.originalprice = originalprice;
    }

    /**
     * @return createtime
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * @return sales
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * @param sales
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     * @return detailproduct
     */
    public String getDetailproduct() {
        return detailproduct;
    }

    /**
     * @param detailproduct
     */
    public void setDetailproduct(String detailproduct) {
        this.detailproduct = detailproduct;
    }
}