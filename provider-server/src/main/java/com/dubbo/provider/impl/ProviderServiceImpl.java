package com.dubbo.provider.impl;

import com.dubbo.provider.service.ProviderService;
import org.springframework.stereotype.Service;
/**
 * 如果在Service注解中指定了bean的名称 ("providerService")
 * 那么在dubbo-provider.xml中就不需要再创建bean了
 * <bean id="providerService" class="com.scarller.provider.impl.ProviderServiceImpl" />
 */
@Service("providerService")
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String pSayHello(String name) {
        StringBuilder str = new StringBuilder();
        str.append("provider say hello to :").append(name+"!!");
        System.out.println("provider 完成服务提供");
        return str.toString();
    }
}