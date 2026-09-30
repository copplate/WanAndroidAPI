package com.example.liumybatisplus.controller;

import com.example.liumybatisplus.entity.Equipment;
import com.example.liumybatisplus.entity.HotKey;
import com.example.liumybatisplus.mapper.EquipmentMapper;
import com.example.liumybatisplus.mapper.HotKeyMapper;
import com.example.liumybatisplus.wrapper.ResponseWrapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class HotKeyController {
    @Autowired
    private HotKeyMapper hotKeyMapper;

    @GetMapping("/hotkey/json")
    public ResponseWrapper<List<HotKey>> searchHotKeys(@Param("equipName") String equipName) {
        List<HotKey> hotKeyList = hotKeyMapper.searchHotKeyList();
        return ResponseWrapper.success(hotKeyList);
    }
}
