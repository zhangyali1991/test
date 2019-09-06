package com.utils;

import com.enums.ApiEnum;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;


/**
 * Created by zhangyali on 2019/6/8.
 */
public class PropertiesUtil {
/*
*
* 使用 Java 提供的 ResourceBundle 类读取 application.properties 文件中的配置参数，集合 Enum 枚举类，与 switch / case 结合使用，实现 “接口” 的获取；
*
*
* */

    //      文件路径：resources/environment/choose_env/choose_env.properties
    static String file_name = "choose_env";
    static String file_path = "environment/choose_env/" + file_name;

    //      根据 key 获取到 value，即：文件前缀名称choose_env，再根据 value 获取具体的 test1.properties
    static ResourceBundle resource = ResourceBundle.getBundle(file_path, Locale.CHINA);
    static String env_config_file_name = resource.getString("choose_env_config_file_name");

    //     根据key 获取到value  读取文件 test1.properties获取对应ip+接口地址
    static String env_config_file_path = "environment/choose_env/" + env_config_file_name;
    static ResourceBundle resource1 = ResourceBundle.getBundle(env_config_file_path, Locale.CHINA);

    /**
     * 不定义枚举，直接使用 resource1.getString()
     *
     * @return
     */
    public static String getUrl() {

        String url = resource1.getString("findById_Url_v2");

        return url;
    }

    /**
     * 通过枚举获取 apiEnum.findById_Url_v2 ，在转化成字符串
     *
     * @param apiEnum
     * @return
     */
    public static String getUrl(ApiEnum apiEnum) {

        String str = String.valueOf(apiEnum);

        if (str.equals("findById_Url_v2")) {
            String url = resource1.getString(str);

            return url;
        }

        return "null";
    }
    /*
    * 通过枚举类 switch case 获取接口地址
    *
    * */

    public static String getUrl2(ApiEnum apiEnum) {

        String url = null;

        switch (apiEnum) {

            case findById_Url_v2:
                url = resource1.getString(String.valueOf(apiEnum));
                break;

            case findUser_Url_v2:
                url = resource1.getString(String.valueOf(apiEnum));
                break;

            case findUserJsonArray_Url_v2:
                url = resource1.getString(String.valueOf(apiEnum));
                break;

            case findUserJson_Url_v2:
                url = resource1.getString(String.valueOf(apiEnum));
                break;
            default:
        }

        return url;
    }


    /*
    * 通过枚举类switch case获取ip地址
    *
    * */
    public static String getIp(ApiEnum apiEnum) {
        String ip = null;
        switch (apiEnum) {
            case env_ip:
                ip = resource1.getString(String.valueOf(apiEnum));
        }
        return ip;
    }

    /*
    * 获取完整的ip+接口地址
    *
    * */
    public static String getHost(ApiEnum apiEnum) {
        String ip = resource1.getString("env_ip");
        return ip + getUrl2(apiEnum);

    }

    @Test
    public void test1() {

        System.out.println(PropertiesUtil.getUrl());

    }

    @Test
    public void test2() {

        System.out.println(PropertiesUtil.getHost(ApiEnum.findUser_Url_v2));

    }
}