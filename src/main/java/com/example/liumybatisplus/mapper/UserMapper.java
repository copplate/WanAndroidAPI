package com.example.liumybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.liumybatisplus.entity.User;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Mapper//这个@Mapper注解说明这是一个Mapper组件
public interface UserMapper extends BaseMapper<User> {

    /*//查询所有用户
    @Select("select * from user")//这个sql语句，会自动去找配置文件里的mydb数据库
    public List<User> find();

    //增加一个用户
    @Insert("insert into user values (#{id},#{username},#{password},#{birthday})")
    public int insert(User user);

    int addUser();*/

    //查询用户，根据用户id查询信息
    @Select("select * from user where id = #{id}")
    User selectById(int id);

    //查询用户及其所有的订单(这时就需要自己去完成映射关系了，无法借助MybatisPlus了，它对于多表是无能为力的)
    @Select("select * from t_user")
    @Results(
            {
                    @Result(column = "id",property = "id"),
                    @Result(column = "username",property = "username"),
                    @Result(column = "password",property = "password"),
                    @Result(column = "birthday",property = "birthday"),
                    @Result(column = "id",property = "orders",javaType = List.class,
                            many = @Many(select = "com.example.liumybatisplus.mapper.OrderMapper.selectByUid"))
            }
    )
    List<User> selectAllUserAndOrders();




}
