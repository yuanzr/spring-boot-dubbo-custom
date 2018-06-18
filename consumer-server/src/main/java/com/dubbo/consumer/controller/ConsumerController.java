package com.dubbo.consumer.controller;

import com.dubbo.provider.service.ProviderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class ConsumerController {

    @Resource
    private ProviderService providerService;

    @RequestMapping("/call")
    public String callProviter(String name){
        String result = providerService.pSayHello(name);
        System.out.println("Consumer调用服务成功!");
        return "success:" + result;
    }

}