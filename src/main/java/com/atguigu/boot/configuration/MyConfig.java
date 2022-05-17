package com.atguigu.boot.configuration;

import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 总结：使用代理，容器实例唯一，不使用代理，多次调用多个实例。
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法，检查这个组件是否在容器中有
 *      Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *          MyConfig$$EnhancerBySpringCGLIB$$ce2740e1
 *      Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 *          MyConfig
 *      组件依赖必须使用Full模式默认。其他默认是否Lite模式
 */

@Configuration(proxyBeanMethods=true)//指定配置类   proxyBeanMethods默认值为true
public class MyConfig {
    @Bean   //给容器添加组件，方法名作为组件id，
    public User user(){
        return new User("jack",18);
    }
}
