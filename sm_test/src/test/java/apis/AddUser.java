package apis;

import com.alibaba.fastjson.JSONObject;
import org.testng.Reporter;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.HttpRequest;
import utils.PropertiesUtil;

import java.util.HashMap;
import java.util.Map;



public class AddUser {
@Parameters({"userName","password"})
    @Test
    public static void addTest(String password,String userName) throws Exception {
        Map<String, String> map = new HashMap();
        map.put("age", "18");
        map.put("id", "10");
        map.put("isDelete", "N");
        map.put("password", password);
        map.put("permission", "Y");
        map.put("sex", "1");
        map.put("userName",userName);
        System.out.println("请求参数为：" + JSONObject.toJSONString(map));
        String str = JSONObject.toJSONString(map);
        System.out.println("请求地址为" + PropertiesUtil.getPropValue("addUrl"));

        String response = HttpRequest.postRequest( PropertiesUtil.getPropValue("addUrl"), str);

        System.out.println("响应参数为" + response);
        Reporter.log("响应参数为:"+response);

//断言
// DB操作
// 场景
    }

}
