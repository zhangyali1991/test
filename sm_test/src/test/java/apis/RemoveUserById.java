package apis;

import com.alibaba.fastjson.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.HttpRequest;
import utils.PropertiesUtil;

import java.util.HashMap;
import java.util.Map;

import static url.ApiUrl.removeUserById_Url;

public class RemoveUserById {
    //    根据id删除用户
    @Parameters( {"id"})
    @Test
    public void findById(int id) throws Exception {



        Map<String, Object> map = new HashMap();
        map.put("id", id);

        System.out.println("请求参数为" + JSONObject.toJSONString(map));
        String str = JSONObject.toJSONString(map.get("id"));
        String response = HttpRequest.findUserById( PropertiesUtil.getPropValue("removeUserById_Url"), str);

        System.out.println("响应参数：" + response);
    }
}
