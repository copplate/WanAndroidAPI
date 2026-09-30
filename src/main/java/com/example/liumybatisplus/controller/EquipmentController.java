package com.example.liumybatisplus.controller;

import com.example.liumybatisplus.entity.Equipment;
import com.example.liumybatisplus.mapper.EquipmentMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class EquipmentController {
    @Autowired
    private EquipmentMapper equipmentMapper;

    @GetMapping("/equipment/fuzzySearchEquips")
    public List<Equipment> fuzzySearchEquips(@Param("equipName") String equipName) {
        List<Equipment> equipment = equipmentMapper.fuzzySearchEquipNameList(equipName);
        return equipment;
    }
}
