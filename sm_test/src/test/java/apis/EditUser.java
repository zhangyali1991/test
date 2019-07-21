package apis;

import com.alibaba.fastjson.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import utils.HttpRequest;
import utils.PropertiesUtil;

import java.util.HashMap;
import java.util.Map;
import static url.ApiUrl.editUser_Url;
//根据id编辑用户
public class EditUser {

    @Test()
    public static void edit() throws Exception {
        Map<String, String> map = new HashMap();
        map.put("age", "18");
        map.put("id", "607");
        map.put("isDelete", "N");
        map.put("password", "123456");
        map.put("permission", "Y");
        map.put("sex", "1");
        map.put("userName", "张三");
        System.out.println("请求参数为：" + JSONObject.toJSONString(map));
        String str = JSONObject.toJSONString(map);
        String response = HttpRequest.postRequest(PropertiesUtil.getPropValue("editUser_Url"), str);
        System.out.println("响应参数为" + response);


    }
}
