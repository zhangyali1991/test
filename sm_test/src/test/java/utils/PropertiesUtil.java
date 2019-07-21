package utils;

import java.io.*;
import java.util.Properties;


/**
 * Created by zhangyali on 2019/6/8.
 */
public class PropertiesUtil {
//获取配置文件的值

    public static String getPropValue(String propKey) throws IOException {
        Properties properties = new Properties();
        // 使用InPutStream流读取properties文件（读取任何地方的配置文件）
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\work\\sm_test\\src\\test\\java\\config\\config.properties"));
//          加载输入流
        properties.load(bufferedReader);
        // 获取key对应的value值
        return properties.getProperty(propKey);


    }
}