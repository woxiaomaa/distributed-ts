package com.ma.shopservice.service.impl;

import com.ma.service.CustomerService;
import com.ma.service.ProviderService;
import com.ma.service.ShopService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(version = "1.0.0")
public class ShopServiceImpl implements ShopService {
    @Reference(version = "1.0.0")
    private ProviderService  providerService;

    @Reference(version = "1.0.0")
    private CustomerService customerService;

    @Override
    @Transactional
    public void shop(int proId, int cusId, int amount) {
        providerService.earnMoney(proId,amount);
        if(amount == 2){
            int i = 1/0;
        }
        customerService.pay(cusId,amount);
    }
}
