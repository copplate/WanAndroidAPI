package com.example.liumybatisplus.vo;


import cn.hutool.core.date.DateTime;
import com.example.liumybatisplus.entity.MainRecordItem;
import com.example.liumybatisplus.entity.RecordItem;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.List;

public class GameRecordVo {

    private DateTime startTime;
    private String consumeTime;
    private String gameType;
    private List<RecordItem> recordItemList;
    private String outcome;



    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public String getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public List<RecordItem> getRecordItemList() {
        return recordItemList;
    }

    public void setRecordItemList(List<RecordItem> recordItemList) {
        this.recordItemList = recordItemList;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }
}
