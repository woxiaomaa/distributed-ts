package com.ma.providerservice.service.impl;

import com.ma.providerservice.mapper.ProviderMapper;
import com.ma.service.ProviderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(version = "1.0.0")
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private ProviderMapper providerMapper;

    @Override
    @Transactional
    public void earnMoney(int id, int amount) {
        providerMapper.earnMoney(id,amount);
    }
}
