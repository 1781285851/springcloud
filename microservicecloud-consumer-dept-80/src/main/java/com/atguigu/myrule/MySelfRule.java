package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule
{
    //IRule：根据特定算法中从服务列表中选取一个要访问的服务
    @Bean
    public IRule myRule()
    {
        //return new RandomRule();//Ribbon默认是轮询，我自定义为随机

        return new RandomRule_ZY();//我自定义为每个机器被访问5次
    }
}

