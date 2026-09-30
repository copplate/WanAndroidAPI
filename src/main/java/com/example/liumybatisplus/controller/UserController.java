package com.example.liumybatisplus.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.liumybatisplus.entity.User;
import com.example.liumybatisplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user/findAll")
    public List<User> find() {
        return userMapper.selectAllUserAndOrders();
    }

    //先来一个查询，返回所有的用户信息
    @GetMapping("/user")
    public List query() {//用户访问了这个方法以后，就会去找Mapper，操作数据库
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
        return users;
    }

    @PostMapping("/user")
    public String save(User user) {
        //实际开发中，此处最好做一个校验，再往数据库里存
        int i = userMapper.insert(user);
        System.out.println(user);
        if (i > 0) {
            return "插入成功";
        } else {
            return "插入失败";
        }
    }

    //分页查询
    @GetMapping("/user/findByPage")
    public IPage findByPage() {
        //设置起始值及每页条数，User泛型的作用是告诉它查询哪张表
        Page<User> page = new Page<>(0,2);
        //IPage是用来描述结果集的
        IPage ipage  = userMapper.selectPage(page, null);
        return ipage;
    }

}
