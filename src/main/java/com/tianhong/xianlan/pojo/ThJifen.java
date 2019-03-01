package com.tianhong.xianlan.pojo;

import javax.persistence.*;

@Table(name = "th_jifen")
public class ThJifen {
    @Id
    private Integer id;

    private String uopenid;

    private Integer uid;

    private String uname;

    private String utel;

    @Column(name = "jifen_num")
    private Integer jifenNum;

    @Column(name = "jifen_all")
    private Integer jifenAll;

    @Column(name = "c_time")
    private Integer cTime;

    private String detail;

    private Integer leibie;

    @Column(name = "i_or_e")
    private Integer iOrE;

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
     * @return uopenid
     */
    public String getUopenid() {
        return uopenid;
    }

    /**
     * @param uopenid
     */
    public void setUopenid(String uopenid) {
        this.uopenid = uopenid;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * @return utel
     */
    public String getUtel() {
        return utel;
    }

    /**
     * @param utel
     */
    public void setUtel(String utel) {
        this.utel = utel;
    }

    /**
     * @return jifen_num
     */
    public Integer getJifenNum() {
        return jifenNum;
    }

    /**
     * @param jifenNum
     */
    public void setJifenNum(Integer jifenNum) {
        this.jifenNum = jifenNum;
    }

    /**
     * @return jifen_all
     */
    public Integer getJifenAll() {
        return jifenAll;
    }

    /**
     * @param jifenAll
     */
    public void setJifenAll(Integer jifenAll) {
        this.jifenAll = jifenAll;
    }

    /**
     * @return c_time
     */
    public Integer getcTime() {
        return cTime;
    }

    /**
     * @param cTime
     */
    public void setcTime(Integer cTime) {
        this.cTime = cTime;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * @return leibie
     */
    public Integer getLeibie() {
        return leibie;
    }

    /**
     * @param leibie
     */
    public void setLeibie(Integer leibie) {
        this.leibie = leibie;
    }

    /**
     * @return i_or_e
     */
    public Integer getiOrE() {
        return iOrE;
    }

    /**
     * @param iOrE
     */
    public void setiOrE(Integer iOrE) {
        this.iOrE = iOrE;
    }
}