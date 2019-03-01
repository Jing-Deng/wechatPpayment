package com.tianhong.xianlan.pojo;

import javax.persistence.*;

@Table(name = "th_address")
public class ThAddress {
    @Id
    private Integer id;

    /**
     * 收货人姓名
     */
    private String opid;

    /**
     * 收货人姓名
     */
    private String username;

    /**
     * 收货人电话
     */
    private String telephone;

    /**
     * 收货地址
     */
    private String address;

    /**
     * 详细收货地址
     */
    @Column(name = "address_details")
    private String addressDetails;

    /**
     * 邮政编码
     */
    private String youzheng;

    private Integer states;

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
     * 获取收货人姓名
     *
     * @return opid - 收货人姓名
     */
    public String getOpid() {
        return opid;
    }

    /**
     * 设置收货人姓名
     *
     * @param opid 收货人姓名
     */
    public void setOpid(String opid) {
        this.opid = opid;
    }

    /**
     * 获取收货人姓名
     *
     * @return username - 收货人姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置收货人姓名
     *
     * @param username 收货人姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取收货人电话
     *
     * @return telephone - 收货人电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置收货人电话
     *
     * @param telephone 收货人电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取收货地址
     *
     * @return address - 收货地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置收货地址
     *
     * @param address 收货地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取详细收货地址
     *
     * @return address_details - 详细收货地址
     */
    public String getAddressDetails() {
        return addressDetails;
    }

    /**
     * 设置详细收货地址
     *
     * @param addressDetails 详细收货地址
     */
    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    /**
     * 获取邮政编码
     *
     * @return youzheng - 邮政编码
     */
    public String getYouzheng() {
        return youzheng;
    }

    /**
     * 设置邮政编码
     *
     * @param youzheng 邮政编码
     */
    public void setYouzheng(String youzheng) {
        this.youzheng = youzheng;
    }

    /**
     * @return states
     */
    public Integer getStates() {
        return states;
    }

    /**
     * @param states
     */
    public void setStates(Integer states) {
        this.states = states;
    }
}