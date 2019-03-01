package com.tianhong.xianlan.utils.wxUtil;

import lombok.Data;

/**
 * @描述：
 * @author: DengChengJing
 * @CreateDate: 2019/2/28 15:17
 */
@Data
public class WXRefuntResult {
    private String return_code;//退款接口调用结果

    private String return_msg;//退款接口调用结果信息

    private String result_code;//退款结果

    private String err_code_des;//退款失败时错误信息
}
