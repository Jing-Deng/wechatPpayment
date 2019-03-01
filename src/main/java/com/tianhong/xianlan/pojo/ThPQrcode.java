package com.tianhong.xianlan.pojo;

import javax.persistence.*;

@Table(name = "th_p_qrcode")
public class ThPQrcode {
    @Id
    private Integer id;

    private Integer randnum;

    @Column(name = "jifen_add")
    private Integer jifenAdd;

    private Integer status;

    private String createtime;

    private Integer lid;

    @Column(name = "scan_time")
    private String scanTime;

    @Column(name = "scan_diangong")
    private String scanDiangong;

    private  Integer cate;

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
     * @return randnum
     */
    public Integer getRandnum() {
        return randnum;
    }

    /**
     * @param randnum
     */
    public void setRandnum(Integer randnum) {
        this.randnum = randnum;
    }

    /**
     * @return jifen_add
     */
    public Integer getJifenAdd() {
        return jifenAdd;
    }

    /**
     * @param jifenAdd
     */
    public void setJifenAdd(Integer jifenAdd) {
        this.jifenAdd = jifenAdd;
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
     * @return lid
     */
    public Integer getLid() {
        return lid;
    }

    /**
     * @param lid
     */
    public void setLid(Integer lid) {
        this.lid = lid;
    }

    /**
     * @return scan_time
     */
    public String getScanTime() {
        return scanTime;
    }

    /**
     * @param scanTime
     */
    public void setScanTime(String scanTime) {
        this.scanTime = scanTime;
    }

    /**
     * @return scan_diangong
     */
    public String getScanDiangong() {
        return scanDiangong;
    }

    /**
     * @param scanDiangong
     */
    public void setScanDiangong(String scanDiangong) {
        this.scanDiangong = scanDiangong;
    }

    public Integer getCate() {
        return cate;
    }

    public void setCate(Integer cate) {
        this.cate = cate;
    }
}