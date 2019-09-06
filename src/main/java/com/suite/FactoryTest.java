package com.suite;


import com.apis.find.FindUser;
import com.apis.find.FindUserJson;
import org.testng.annotations.Factory;

/**
 * Created by zhangyali on 2019/7/16.
 */
public class FactoryTest {
    /*
    *测试套件类Factory
    *实现testng批量运行所有测试用例,使用工厂@Factory类实现
    *
    */

    @Factory()
    public Object[] FactoryTest() {
        return new Object[]{
//                批量运行   构造函数
                new FindUser(),
                new FindUserJson()
        };
    }
}