package com.ma.shopedge.controller;

import com.ma.service.CustomerService;
import com.ma.service.ProviderService;
import com.ma.service.ShopService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    @Reference(version = "1.0.0")
    private ShopService shopService;

    @GetMapping("buy")
    public String buy(@RequestParam int id,@RequestParam int amount){
        shopService.shop(id,id,amount);
        return "ok";
    }

}
