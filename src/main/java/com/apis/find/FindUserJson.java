package com.apis.find;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.enums.ApiEnum;
import com.utils.HttpRequest;
import com.utils.PropertiesUtil;
import org.testng.annotations.Test;


import java.util.HashMap;
import java.util.Map;

public class FindUserJson {
//    返回json格式的字符串
@Test
public static void addTest() throws Exception {
    Map<String, String> map = new HashMap();
    map.put("age", "");
    map.put("id", "");
    map.put("isDelete", "");
    map.put("password", "yes2");
    map.put("permission", "");
    map.put("sex", "");
    map.put("userName", "yes1");
    System.out.println("请求参数为：" + JSONObject.toJSONString(map));
    String str = JSONObject.toJSONString(map);
    String response = HttpRequest.postRequest(PropertiesUtil.getHost(ApiEnum.findUserJson_Url_v2),str);
     JSONObject jsonObject= JSON.parseObject(str);
    System.out.println("响应参数为" + response);
//
  String name= JSONPath.eval(jsonObject,"$userName").toString();
  if (name.contains("yes1")){
      System.out.println("查询成功");
  }else {
      System.out.println("查询失败");
  }


}
}
