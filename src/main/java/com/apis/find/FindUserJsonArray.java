package com.apis.find;

import com.alibaba.fastjson.JSONObject;
import com.enums.ApiEnum;
import com.utils.HttpRequest;
import com.utils.PropertiesUtil;
import org.testng.annotations.Test;


import java.util.HashMap;
import java.util.Map;

public class FindUserJsonArray {
    //    返回json格式的字符串
    @Test
    public static void addTest() throws Exception {
        Map<String, String> map = new HashMap();
        map.put("age", "");
        map.put("id", "");
        map.put("isDelete", "");
        map.put("password", "");
        map.put("permission", "");
        map.put("sex", "");
        map.put("userName", "lisi");
        System.out.println("请求参数为：" + JSONObject.toJSONString(map));
        String str = JSONObject.toJSONString(map);
        String response = HttpRequest.postRequest(PropertiesUtil.getHost(ApiEnum.findUserJsonArray_Url_v2),str);
        System.out.println("响应参数为" + response);


    }
}
