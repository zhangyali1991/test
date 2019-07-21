package apis;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.testng.annotations.Test;
import utils.HttpRequest;
import utils.PropertiesUtil;

import java.util.HashMap;
import java.util.Map;

import static url.ApiUrl.findUserJsonArray_Url;
import static url.ApiUrl.findUserJson_Url;

public class FindUserJson {
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
    map.put("userName", "2");
    System.out.println("请求参数为：" + JSONObject.toJSONString(map));
    String str = JSONObject.toJSONString(map);
    String response = HttpRequest.postRequest(PropertiesUtil.getPropValue("findUserJson_Url"), str);
//    JSONArray json = JSONArray.fromObject(response);
    System.out.println("响应参数为" + response);


}
}
