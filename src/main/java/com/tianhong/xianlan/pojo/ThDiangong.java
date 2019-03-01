package com.tianhong.xianlan.pojo;

import javax.persistence.*;

@Table(name = "th_diangong")
public class ThDiangong {
    @Id
    private Integer id;

    @Column(name = "dg_name")
    private String dgName;

    private String wxid;

    @Column(name = "dg_tel")
    private String dgTel;

    private String address;

    @Column(name = "work_year")
    private String workYear;

    @Column(name = "zj_num")
    private String zjNum;

    @Column(name = "zj_picz")
    private String zjPicz;

    @Column(name = "zj_picf")
    private String zjPicf;

    @Column(name = "dg_jifen")
    private Integer dgJifen;

    @Column(name = "dg_score")
    private Integer dgScore;

    @Column(name = "create_time")
    private String createTime;

    private String headimgurl;

    @Column(name = "dg_sfzz")
    private String dgSfzz;

    @Column(name = "dg_sfzf")
    private String dgSfzf;

    @Column(name = "dg_sfzh")
    private String dgSfzh;

    private Integer status;

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
     * @return dg_name
     */
    public String getDgName() {
        return dgName;
    }

    /**
     * @param dgName
     */
    public void setDgName(String dgName) {
        this.dgName = dgName;
    }

    /**
     * @return wxid
     */
    public String getWxid() {
        return wxid;
    }

    /**
     * @param wxid
     */
    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    /**
     * @return dg_tel
     */
    public String getDgTel() {
        return dgTel;
    }

    /**
     * @param dgTel
     */
    public void setDgTel(String dgTel) {
        this.dgTel = dgTel;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return work_year
     */
    public String getWorkYear() {
        return workYear;
    }

    /**
     * @param workYear
     */
    public void setWorkYear(String workYear) {
        this.workYear = workYear;
    }

    /**
     * @return zj_num
     */
    public String getZjNum() {
        return zjNum;
    }

    /**
     * @param zjNum
     */
    public void setZjNum(String zjNum) {
        this.zjNum = zjNum;
    }

    /**
     * @return zj_picz
     */
    public String getZjPicz() {
        return zjPicz;
    }

    /**
     * @param zjPicz
     */
    public void setZjPicz(String zjPicz) {
        this.zjPicz = zjPicz;
    }

    /**
     * @return zj_picf
     */
    public String getZjPicf() {
        return zjPicf;
    }

    /**
     * @param zjPicf
     */
    public void setZjPicf(String zjPicf) {
        this.zjPicf = zjPicf;
    }

    /**
     * @return dg_jifen
     */
    public Integer getDgJifen() {
        return dgJifen;
    }

    /**
     * @param dgJifen
     */
    public void setDgJifen(Integer dgJifen) {
        this.dgJifen = dgJifen;
    }

    /**
     * @return dg_score
     */
    public Integer getDgScore() {
        return dgScore;
    }

    /**
     * @param dgScore
     */
    public void setDgScore(Integer dgScore) {
        this.dgScore = dgScore;
    }

    /**
     * @return create_time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return headimgurl
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * @param headimgurl
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    /**
     * @return dg_sfzz
     */
    public String getDgSfzz() {
        return dgSfzz;
    }

    /**
     * @param dgSfzz
     */
    public void setDgSfzz(String dgSfzz) {
        this.dgSfzz = dgSfzz;
    }

    /**
     * @return dg_sfzf
     */
    public String getDgSfzf() {
        return dgSfzf;
    }

    /**
     * @param dgSfzf
     */
    public void setDgSfzf(String dgSfzf) {
        this.dgSfzf = dgSfzf;
    }

    /**
     * @return dg_sfzh
     */
    public String getDgSfzh() {
        return dgSfzh;
    }

    /**
     * @param dgSfzh
     */
    public void setDgSfzh(String dgSfzh) {
        this.dgSfzh = dgSfzh;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}