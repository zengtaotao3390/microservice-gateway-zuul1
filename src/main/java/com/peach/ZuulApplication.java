package com.peach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by zengtao on 2017/11/14.
 * srpingBootApplication 是一个注解集合，它整合了@Configuration, @EnableAutoConfiguration,@ComponentScan
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args){
        SpringApplication.run(ZuulApplication.class, args);
    }
}
