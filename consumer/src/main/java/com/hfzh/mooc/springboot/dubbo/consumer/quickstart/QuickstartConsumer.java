package com.hfzh.mooc.springboot.dubbo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hfzh.mooc.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * Created by hufangzhou on 2019/11/22.
 */
@Component

public class QuickstartConsumer {

    @Reference(url = "dubbo://127.0.0.1:20880")        //配置去哪找url 默认端口 20880
    ServiceAPI serviceAPI;

    public void sendMessage(String message){
        System.out.println(serviceAPI.sendMessage(message));
    }
}
