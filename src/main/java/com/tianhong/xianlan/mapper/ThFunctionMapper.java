package com.tianhong.xianlan.mapper;

import com.tianhong.xianlan.pojo.ThFunction;
import com.tianhong.xianlan.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface ThFunctionMapper extends MyMapper<ThFunction> {
    /**
     * 根据编号查询功能状态
     * @param id
     * @return
     */
    ThFunction queryByNum(@Param("id") int id);
}