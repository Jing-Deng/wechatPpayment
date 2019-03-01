package com.tianhong.xianlan.pojo;

import javax.persistence.*;

@Table(name = "th_qrcodelist")
public class ThQrcodelist {
    @Id
    private Integer id;

    @Column(name = "num_ewm")
    private Integer numEwm;

    @Column(name = "num_jifen")
    private Integer numJifen;

    @Column(name = "create_time")
    private String createTime;

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
     * @return num_ewm
     */
    public Integer getNumEwm() {
        return numEwm;
    }

    /**
     * @param numEwm
     */
    public void setNumEwm(Integer numEwm) {
        this.numEwm = numEwm;
    }

    /**
     * @return num_jifen
     */
    public Integer getNumJifen() {
        return numJifen;
    }

    /**
     * @param numJifen
     */
    public void setNumJifen(Integer numJifen) {
        this.numJifen = numJifen;
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
}