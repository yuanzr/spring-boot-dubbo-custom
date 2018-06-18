package com.dubbo.provider.impl;

import com.dubbo.provider.service.OrderService;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Override
    public void addBill() {
        System.out.println("addbiil success!!!");
    }
}
