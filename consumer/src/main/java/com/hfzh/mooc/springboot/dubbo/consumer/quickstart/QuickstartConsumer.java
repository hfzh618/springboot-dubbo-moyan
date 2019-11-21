package com.hfzh.mooc.springboot.dubbo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hfzh.mooc.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * Created by hufangzhou on 2019/11/22.
 */
@Component

public class QuickstartConsumer {

    @Reference()        //使用zk注册中心
    ServiceAPI serviceAPI;

    public void sendMessage(String message){
        System.out.println(serviceAPI.sendMessage(message));
    }
}
