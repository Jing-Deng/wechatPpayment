package com.tianhong.xianlan.mapper;

import com.tianhong.xianlan.pojo.ThDiangong;
import com.tianhong.xianlan.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface ThDiangongMapper extends MyMapper<ThDiangong> {
    /**
     * 通过openid查询
     * @param openid
     * @return
     */
    ThDiangong queryByOpenId(@Param("openid") String openid);
}