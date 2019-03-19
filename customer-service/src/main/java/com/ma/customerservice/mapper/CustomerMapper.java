package com.ma.customerservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CustomerMapper {
    @Update("update tb_customer set money = money - #{amount} where id = #{id}")
    void pay(int id,int amount);
}
