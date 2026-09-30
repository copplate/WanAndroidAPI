package com.example.liumybatisplus.controller;

import com.example.liumybatisplus.entity.MainRecordItem;
import com.example.liumybatisplus.entity.RecordItem;
import com.example.liumybatisplus.entity.User;
import com.example.liumybatisplus.mapper.MainRecordItemMapper;
import com.example.liumybatisplus.mapper.RecordItemMapper;
import com.example.liumybatisplus.mapper.UserMapper;
import com.example.liumybatisplus.tool.ImprovedTimestampIdExample;
import com.example.liumybatisplus.vo.GameRecordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class GameRecordController {
    @Autowired
    private MainRecordItemMapper mainRecordItemMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RecordItemMapper recordItemMapper;

    @PostMapping("/gameRecord/add")
    @Transactional
    public String find(@RequestBody GameRecordVo gameRecordVo) {
        MainRecordItem mainRecordItem = new MainRecordItem();
        Long normalId = ImprovedTimestampIdExample.getNormalId();
        mainRecordItem.setId(normalId + "");
        mainRecordItem.setStartTime(gameRecordVo.getStartTime());
        mainRecordItem.setConsumeTime(gameRecordVo.getConsumeTime());
        mainRecordItem.setGameType(gameRecordVo.getGameType());
        mainRecordItem.setOutcome(gameRecordVo.getOutcome());
        mainRecordItemMapper.insert(mainRecordItem);

        for (RecordItem recordItem :
                gameRecordVo.getRecordItemList()) {
            if (recordItem.getPlayRole() == null || recordItem.getPlayRole().length() == 0) {
                continue;
            }
            recordItem.setId(ImprovedTimestampIdExample.getNormalId() + "");
            recordItem.setStartTime(gameRecordVo.getStartTime());
            User user = userMapper.selectById(Integer.parseInt(recordItem.getUserId()));
            recordItem.setUserName(user.getUsername());
            recordItem.setMainRecordId(mainRecordItem.getId());
            recordItemMapper.insert(recordItem);
        }
//        Assert.isTrue(false,"自动抛出");


        return "";
    }
}
