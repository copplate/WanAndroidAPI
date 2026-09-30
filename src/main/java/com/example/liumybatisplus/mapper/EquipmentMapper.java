package com.example.liumybatisplus.mapper;

import com.example.liumybatisplus.entity.Equipment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EquipmentMapper {

    List<Equipment> fuzzySearchEquipNameList(@Param("equipName") String equipName);

}
