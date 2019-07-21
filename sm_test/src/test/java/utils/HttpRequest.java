package utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.apache.http.entity.ContentType;

import java.io.IOException;
import java.util.*;

import static org.apache.http.HttpStatus.SC_OK;

public class HttpRequest {
    /*addUser*/
    public static String postRequest(String uri, String context) throws Exception {
//     创建httpclient
        CloseableHttpClient httpClient = HttpClients.createDefault();
//     创建post对象
        HttpPost post = new HttpPost(uri);
        //构造消息头
        post.setHeader("Content-type", "application/json");
//      请求数据
        //报文头类型是:"Content-type", "application/json",使用StringEntity类；
        // 如果报文头类型是:application/x-www-form-urlencoded,使用List<BasicNameValuePair>,HttpEntity reqEntity = new UrlEncodedFormEntity(params)
        StringEntity strentity = new StringEntity(context, "utf-8");
        post.setEntity(strentity);
//     创建响应对象
        CloseableHttpResponse response = httpClient.execute(post);
        try {
            if (response.getStatusLine().getStatusCode() != SC_OK) {
                response.close();
                System.out.println("Method Faild" + response.getStatusLine().getStatusCode());
                return "error";
            }
            //     获取响应数据的值
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String str = EntityUtils.toString(entity);//将响应数据转化为String
                return str;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {
//            post.releaseConnection();
//        }
        System.out.println("error");
        return "error";
    }
//findUserById
    public static String findUserById(String uri, String content) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(uri);
        List<NameValuePair> list = new ArrayList<NameValuePair>();
        list.add(new BasicNameValuePair("id",content));
        HttpEntity entity = new UrlEncodedFormEntity(list);
        post.setEntity(entity);
        HttpResponse response = httpClient.execute(post);
        try {
            if (response.getStatusLine().getStatusCode() != SC_OK) {
                httpClient.close();
                System.out.println("Method Faild" + response.getStatusLine().getStatusCode());
                return "error";
            }
            //     获取响应数据的值
            HttpEntity entity1 = response.getEntity();
            if (entity1 != null) {
                String str = EntityUtils.toString(entity1);//将响应数据转化为String
                return str;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {
//            post.releaseConnection();
//        }
        System.out.println("error");
        return "error";

    }
}

