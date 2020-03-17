package com.itlike.test;

import com.itlike.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: SpringPro3
 * @Package: com.itlike.test
 * @ClassName: UserTest
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/17 5:12
 * @Version: 1.0
 */
public class UserTest {
    @Test
    public void test(){
//        UserService userService = new UserServiceImpl();
//        userService.delete();
//        System.out.println("----------");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService1 = (UserService) applicationContext.getBean("userService");
        userService1.delete();
    }
}
