package com.example.liumybatisplus.mapper;

import com.example.liumybatisplus.entity.Equipment;
import com.example.liumybatisplus.entity.HotKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HotKeyMapper {

    List<HotKey> searchHotKeyList();

}
