package com.tianhong.xianlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.tianhong.xianlan.mapper")//将项目中对应的mapper类的路径加进来就可以了@MapperScan("com.winter.mapper")这个注解非常的关键，这个对应了项目中mapper（dao）所对应的包路径，
@ComponentScan(basePackages ={"com.tianhong.xianlan.service", "com.tianhong.xianlan.controller"})
public class XianlanApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(XianlanApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的XianlanApplication启动类
        return builder.sources(XianlanApplication.class);
    }

}
