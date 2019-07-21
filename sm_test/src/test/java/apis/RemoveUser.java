package apis;

import com.alibaba.fastjson.JSONObject;
import org.testng.annotations.Test;
import utils.HttpRequest;
import utils.PropertiesUtil;

import java.util.HashMap;
import java.util.Map;

import static url.ApiUrl.removeUser_Url;

public class RemoveUser {
    //根据任意字段删除用户
    @Test
    public static void find() throws Exception {
        Map<String, String> map = new HashMap();
        map.put("age", "18");
        map.put("id", "601");
        map.put("isDelete", "N");
        map.put("password", "123456");
        map.put("permission", "Y");
        map.put("sex", "1");
        map.put("userName", "张三");
        System.out.println("请求参数为：" + JSONObject.toJSONString(map));
        String str = JSONObject.toJSONString(map);
        String response = HttpRequest.postRequest( PropertiesUtil.getPropValue("removeUser_Url"), str);
        System.out.println("响应参数为：" + response);
    }
}
