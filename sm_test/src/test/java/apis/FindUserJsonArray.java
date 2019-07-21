package apis;

import com.alibaba.fastjson.JSONObject;
import org.testng.annotations.Test;
import utils.HttpRequest;
import utils.PropertiesUtil;

import java.util.HashMap;
import java.util.Map;

import static url.ApiUrl.findUserJsonArray_Url;

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
        String response = HttpRequest.postRequest(PropertiesUtil.getPropValue("findUserJsonArray_Url"), str);
        System.out.println("响应参数为" + response);


    }
}
