package apis;

import com.alibaba.fastjson.JSONObject;
import org.testng.annotations.Test;
import utils.HttpRequest;
import utils.PropertiesUtil;

import java.util.HashMap;
import java.util.Map;

public class FindUser {
//根据任意字段查找用户
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
        String response = HttpRequest.postRequest(PropertiesUtil.getPropValue("findUser_Url"), str);
        System.out.println("响应参数为" + response);
    }
}
