package com.tianhong.xianlan.pojo;

import javax.persistence.*;

@Table(name = "th_column")
public class ThColumn {
    @Id
    private Integer id;

    private String colname;

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
     * @return colname
     */
    public String getColname() {
        return colname;
    }

    /**
     * @param colname
     */
    public void setColname(String colname) {
        this.colname = colname;
    }
}