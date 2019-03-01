package com.tianhong.xianlan.pojo;

import javax.persistence.*;

@Table(name = "th_qiandao")
public class ThQiandao {
    @Id
    private Integer id;

    @Column(name = "qd_normal")
    private Integer qdNormal;

    @Column(name = "qd_day")
    private Integer qdDay;

    @Column(name = "qd_guize")
    private String qdGuize;

    @Column(name = "jf_guize")
    private String jfGuize;

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
     * @return qd_normal
     */
    public Integer getQdNormal() {
        return qdNormal;
    }

    /**
     * @param qdNormal
     */
    public void setQdNormal(Integer qdNormal) {
        this.qdNormal = qdNormal;
    }

    /**
     * @return qd_day
     */
    public Integer getQdDay() {
        return qdDay;
    }

    /**
     * @param qdDay
     */
    public void setQdDay(Integer qdDay) {
        this.qdDay = qdDay;
    }

    /**
     * @return qd_guize
     */
    public String getQdGuize() {
        return qdGuize;
    }

    /**
     * @param qdGuize
     */
    public void setQdGuize(String qdGuize) {
        this.qdGuize = qdGuize;
    }

    /**
     * @return jf_guize
     */
    public String getJfGuize() {
        return jfGuize;
    }

    /**
     * @param jfGuize
     */
    public void setJfGuize(String jfGuize) {
        this.jfGuize = jfGuize;
    }
}