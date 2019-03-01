package com.tianhong.xianlan.pojo;

import javax.persistence.*;

@Table(name = "th_jifenhuoqu")
public class ThJifenhuoqu {
    @Id
    private Integer id;

    @Column(name = "jifen_sq")
    private Integer jifenSq;

    @Column(name = "jifen_rz")
    private Integer jifenRz;

    @Column(name = "jifen_sm")
    private Integer jifenSm;

    @Column(name = "jifen_dgz")
    private Integer jifenDgz;

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
     * @return jifen_sq
     */
    public Integer getJifenSq() {
        return jifenSq;
    }

    /**
     * @param jifenSq
     */
    public void setJifenSq(Integer jifenSq) {
        this.jifenSq = jifenSq;
    }

    /**
     * @return jifen_rz
     */
    public Integer getJifenRz() {
        return jifenRz;
    }

    /**
     * @param jifenRz
     */
    public void setJifenRz(Integer jifenRz) {
        this.jifenRz = jifenRz;
    }

    /**
     * @return jifen_sm
     */
    public Integer getJifenSm() {
        return jifenSm;
    }

    /**
     * @param jifenSm
     */
    public void setJifenSm(Integer jifenSm) {
        this.jifenSm = jifenSm;
    }

    /**
     * @return jifen_dgz
     */
    public Integer getJifenDgz() {
        return jifenDgz;
    }

    /**
     * @param jifenDgz
     */
    public void setJifenDgz(Integer jifenDgz) {
        this.jifenDgz = jifenDgz;
    }
}