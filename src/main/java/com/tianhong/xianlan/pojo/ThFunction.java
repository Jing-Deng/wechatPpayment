package com.tianhong.xianlan.pojo;

import javax.persistence.*;

@Table(name = "th_function")
public class ThFunction {
    /**
     * 编号
     */
    @Id
    @Column(name = "Id")
    private Integer id;

    /**
     * 功能状态  1打开  0关闭
     */
    private Integer stata;

    /**
     * 功能描述
     */
    private String desc;

    /**
     * 获取编号
     *
     * @return Id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取功能状态  1打开  0关闭
     *
     * @return stata - 功能状态  1打开  0关闭
     */
    public Integer getStata() {
        return stata;
    }

    /**
     * 设置功能状态  1打开  0关闭
     *
     * @param stata 功能状态  1打开  0关闭
     */
    public void setStata(Integer stata) {
        this.stata = stata;
    }

    /**
     * 获取功能描述
     *
     * @return desc - 功能描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置功能描述
     *
     * @param desc 功能描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }


    public ThFunction() {
    }

    public ThFunction(Integer id, Integer stata, String desc) {
        this.id = id;
        this.stata = stata;
        this.desc = desc;
    }
}