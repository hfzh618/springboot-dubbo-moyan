package com.hfzh.mooc.springboot.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.hfzh.mooc.springboot.dubbo.consumer.quickstart.QuickstartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {
        //获取bean 调用对应方法
        ConfigurableApplicationContext run =  SpringApplication.run(ConsumerApplication.class, args);
        QuickstartConsumer quickstartConsumer = (QuickstartConsumer) run.getBean("quickstartConsumer");
        quickstartConsumer.sendMessage("加油 奥利给！");
    }

}
