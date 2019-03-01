package com.tianhong.xianlan.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "th_order")
public class ThOrder {
    @Id
    private Integer id;

    /**
     * 用户微信id
     */
    private String opid;

    /**
     * 用户名字
     */
    @Column(name = "u_name")
    private String uName;

    /**
     * 收货人电话
     */
    @Column(name = "u_telephone")
    private String uTelephone;

    /**
     * 收货地址
     */
    @Column(name = "u_address")
    private String uAddress;

    /**
     * 详细收货地址
     */
    @Column(name = "u_address_details")
    private String uAddressDetails;

    /**
     * 详细收货地址
     */
    @Column(name = "u_youzheng")
    private String uYouzheng;

    /**
     * 订单号
     */
    @Column(name = "o_number")
    private String oNumber;

    /**
     * 商品名字
     */
    @Column(name = "g_name")
    private String gName;

    /**
     * 商品价格
     */
    @Column(name = "g_price")
    private String gPrice;

    /**
     * 商品图片
     */
    @Column(name = "g_picture")
    private String gPicture;

    /**
     * 商品描述
     */
    @Column(name = "g_desc")
    private String gDesc;

    /**
     * 商品库存
     */
    @Column(name = "g_stock")
    private Integer gStock;

    /**
     * 实际付款
     */
    @Column(name = "buy_money")
    private String buyMoney;

    /**
     * 购买数量
     */
    @Column(name = "buy_number")
    private String buyNumber;

    /**
     * 运费
     */
    private String yunfei;

    /**
     * 付款时间
     */
    @Column(name = "order_time")
    private Date orderTime;

    /**
     * 完成时间
     */
    @Column(name = "finish_time")
    private Date finishTime;

    /**
     * 客服电话
     */
    @Column(name = "service_phone")
    private String servicePhone;

    /**
     * 状态
     */
    private Integer state;

    @Column(name = "fahuo_time")
    private String fahuoTime;

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
     * 获取用户微信id
     *
     * @return opid - 用户微信id
     */
    public String getOpid() {
        return opid;
    }

    /**
     * 设置用户微信id
     *
     * @param opid 用户微信id
     */
    public void setOpid(String opid) {
        this.opid = opid;
    }

    /**
     * 获取用户名字
     *
     * @return u_name - 用户名字
     */
    public String getuName() {
        return uName;
    }

    /**
     * 设置用户名字
     *
     * @param uName 用户名字
     */
    public void setuName(String uName) {
        this.uName = uName;
    }

    /**
     * 获取收货人电话
     *
     * @return u_telephone - 收货人电话
     */
    public String getuTelephone() {
        return uTelephone;
    }

    /**
     * 设置收货人电话
     *
     * @param uTelephone 收货人电话
     */
    public void setuTelephone(String uTelephone) {
        this.uTelephone = uTelephone;
    }

    /**
     * 获取收货地址
     *
     * @return u_address - 收货地址
     */
    public String getuAddress() {
        return uAddress;
    }

    /**
     * 设置收货地址
     *
     * @param uAddress 收货地址
     */
    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    /**
     * 获取详细收货地址
     *
     * @return u_address_details - 详细收货地址
     */
    public String getuAddressDetails() {
        return uAddressDetails;
    }

    /**
     * 设置详细收货地址
     *
     * @param uAddressDetails 详细收货地址
     */
    public void setuAddressDetails(String uAddressDetails) {
        this.uAddressDetails = uAddressDetails;
    }

    /**
     * 获取详细收货地址
     *
     * @return u_youzheng - 详细收货地址
     */
    public String getuYouzheng() {
        return uYouzheng;
    }

    /**
     * 设置详细收货地址
     *
     * @param uYouzheng 详细收货地址
     */
    public void setuYouzheng(String uYouzheng) {
        this.uYouzheng = uYouzheng;
    }

    /**
     * 获取订单号
     *
     * @return o_number - 订单号
     */
    public String getoNumber() {
        return oNumber;
    }

    /**
     * 设置订单号
     *
     * @param oNumber 订单号
     */
    public void setoNumber(String oNumber) {
        this.oNumber = oNumber;
    }

    /**
     * 获取商品名字
     *
     * @return g_name - 商品名字
     */
    public String getgName() {
        return gName;
    }

    /**
     * 设置商品名字
     *
     * @param gName 商品名字
     */
    public void setgName(String gName) {
        this.gName = gName;
    }

    /**
     * 获取商品价格
     *
     * @return g_price - 商品价格
     */
    public String getgPrice() {
        return gPrice;
    }

    /**
     * 设置商品价格
     *
     * @param gPrice 商品价格
     */
    public void setgPrice(String gPrice) {
        this.gPrice = gPrice;
    }

    /**
     * 获取商品图片
     *
     * @return g_picture - 商品图片
     */
    public String getgPicture() {
        return gPicture;
    }

    /**
     * 设置商品图片
     *
     * @param gPicture 商品图片
     */
    public void setgPicture(String gPicture) {
        this.gPicture = gPicture;
    }

    /**
     * 获取商品描述
     *
     * @return g_desc - 商品描述
     */
    public String getgDesc() {
        return gDesc;
    }

    /**
     * 设置商品描述
     *
     * @param gDesc 商品描述
     */
    public void setgDesc(String gDesc) {
        this.gDesc = gDesc;
    }

    /**
     * 获取商品库存
     *
     * @return g_stock - 商品库存
     */
    public Integer getgStock() {
        return gStock;
    }

    /**
     * 设置商品库存
     *
     * @param gStock 商品库存
     */
    public void setgStock(Integer gStock) {
        this.gStock = gStock;
    }

    /**
     * 获取实际付款
     *
     * @return buy_money - 实际付款
     */
    public String getBuyMoney() {
        return buyMoney;
    }

    /**
     * 设置实际付款
     *
     * @param buyMoney 实际付款
     */
    public void setBuyMoney(String buyMoney) {
        this.buyMoney = buyMoney;
    }

    /**
     * 获取购买数量
     *
     * @return buy_number - 购买数量
     */
    public String getBuyNumber() {
        return buyNumber;
    }

    /**
     * 设置购买数量
     *
     * @param buyNumber 购买数量
     */
    public void setBuyNumber(String buyNumber) {
        this.buyNumber = buyNumber;
    }

    /**
     * 获取运费
     *
     * @return yunfei - 运费
     */
    public String getYunfei() {
        return yunfei;
    }

    /**
     * 设置运费
     *
     * @param yunfei 运费
     */
    public void setYunfei(String yunfei) {
        this.yunfei = yunfei;
    }

    /**
     * 获取付款时间
     *
     * @return order_time - 付款时间
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 设置付款时间
     *
     * @param orderTime 付款时间
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 获取完成时间
     *
     * @return finish_time - 完成时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置完成时间
     *
     * @param finishTime 完成时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 获取客服电话
     *
     * @return service_phone - 客服电话
     */
    public String getServicePhone() {
        return servicePhone;
    }

    /**
     * 设置客服电话
     *
     * @param servicePhone 客服电话
     */
    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return fahuo_time
     */
    public String getFahuoTime() {
        return fahuoTime;
    }

    /**
     * @param fahuoTime
     */
    public void setFahuoTime(String fahuoTime) {
        this.fahuoTime = fahuoTime;
    }
}