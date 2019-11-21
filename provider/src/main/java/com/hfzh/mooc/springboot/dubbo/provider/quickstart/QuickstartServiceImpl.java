package com.hfzh.mooc.springboot.dubbo.provider.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.hfzh.mooc.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * Created by hufangzhou on 2019/11/22.
 */
@Component
@Service(interfaceClass = ServiceAPI.class)  //使用dubbo的service注解
public class QuickstartServiceImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message){
        return "quickstart-provider-message="+message;
    }
}
