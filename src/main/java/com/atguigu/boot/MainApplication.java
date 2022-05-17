package com.atguigu.boot;

import com.atguigu.boot.bean.User;
import com.atguigu.boot.configuration.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @SpringBootApplication：告诉springboot，这是一个sprinboot应用(主程序类)
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //1.返回ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        
        //2.查看容器组件
//        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }

        //3.从容器中获取组件
        User user = (User)run.getBean("user",User.class);


        //4.配置类本身也是一个组件
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);
        User user1 = bean.user();
        User user2 = bean.user();
        System.out.println(user1==user2);
        System.out.println(user==user1);
        //daa
    }
}
