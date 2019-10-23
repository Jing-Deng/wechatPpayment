package com.tianhong.xianlan.mapper;

import com.tianhong.xianlan.pojo.ThPQrcode;
import com.tianhong.xianlan.utils.MyMapper;

import java.util.List;
import java.util.Map;

public interface ThPQrcodeMapper extends MyMapper<ThPQrcode> {
    List<Map<String,Object>> getMapData(String starttime, String endtime);
}