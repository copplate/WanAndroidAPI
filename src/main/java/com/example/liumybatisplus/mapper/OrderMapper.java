package com.example.liumybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.liumybatisplus.entity.Order;
import com.example.liumybatisplus.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    @Select("select * from t_order where uid = #{uid}")
    List<Order> selectByUid(int uid);


    //查询所有的订单，同时查询订单的用户

    @Select("select * from t_order")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "orderTime",property = "order_time"),
            @Result(column = "total",property = "total"),
            @Result(column = "uid",property = "user",javaType = User.class,
                    one = @One(select = "com.example.liumybatisplus.mapper.UserMapper.selectById")),

    })
    List<Order> selectAllOrderAndUser();
}
