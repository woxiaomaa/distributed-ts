package com.ma.customerservice.service.impl;

import com.ma.customerservice.mapper.CustomerMapper;
import com.ma.service.CustomerService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(version = "1.0.0")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    @Transactional
    public void pay(int id, int amount) {
        customerMapper.pay(id,amount);
    }
}
