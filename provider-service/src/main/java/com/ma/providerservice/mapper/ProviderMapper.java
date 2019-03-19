package com.ma.providerservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ProviderMapper {
    @Update("update tb_provider set money = money + #{amount} where id = #{id}")
    void earnMoney(int id,int amount);

}
