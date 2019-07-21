package apis;

import com.alibaba.fastjson.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.HttpRequest;
import utils.PropertiesUtil;

import java.util.HashMap;
import java.util.Map;

import static url.ApiUrl.findById_Url;

public class FindUserById {
//    根据id查找用户
@Parameters( {"id"})
    @Test
    public void findById(int id) throws Exception {



        Map<String, Object> map = new HashMap();
        map.put("id", id);

        System.out.println("请求参数为:" + JSONObject.toJSONString(map));
        String str = JSONObject.toJSONString(map.get("id"));
        System.out.println(str);
        String response = HttpRequest.findUserById(PropertiesUtil.getPropValue("findById_Url"), str);
        System.out.println("响应参数：" + response);
    }


}
