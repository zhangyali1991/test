package com.apis.find;

import com.alibaba.fastjson.JSONObject;
import com.enums.ApiEnum;
import com.utils.HttpRequest;
import com.utils.PropertiesUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import java.util.HashMap;
import java.util.Map;

public class FindUser {
    //根据任意字段查找用户
    String age = null;
    int id = 0;
    String isDelete= null;
    String password= null;
    String permission= null;
    String sex= null;
    String userName= null;
    @Parameters({"age","id","isDelete","password","permission","sex","userName"})

    @Test
    public static void find() throws Exception {




        Map<String, String> map = new HashMap();
        map.put("age", "");
        map.put("id", "607");
        map.put("isDelete", "");
        map.put("password", "");
        map.put("permission", "");
        map.put("sex", "");
        map.put("userName", "");
        System.out.println("请求参数为：" + JSONObject.toJSONString(map));
        String str = JSONObject.toJSONString(map);
        String response = HttpRequest.postRequest(PropertiesUtil.getHost(ApiEnum.findUser_Url_v2), str);
        System.out.println("响应参数为" + response);
    }
}
