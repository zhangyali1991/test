package com.apis.find;

import com.alibaba.fastjson.JSONObject;
import com.enums.ApiEnum;
import com.utils.HttpRequest;
import com.utils.PropertiesUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import java.util.HashMap;
import java.util.Map;

public class FindUserById {
    //    根据id查找用户

    @Parameters({"id"})

    @Test
    public void findById(int id) throws Exception {

        Map<String, Object> map = new HashMap();
        map.put("id", id);
        System.out.println("请求参数为:" + JSONObject.toJSONString(map));

        String str = JSONObject.toJSONString(map.get("id"));
        System.out.println(str);

        String response = HttpRequest.findUserById(PropertiesUtil.getHost( ApiEnum.findById_Url_v2), str);
        System.out.println("响应参数：" + response);
    }


}
