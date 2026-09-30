package com.example.liumybatisplus.entity;

import cn.hutool.core.date.DateTime;

public class MainRecordItem {

    private String id;
    private DateTime startTime;//开始时间
    private String consumeTime;//消耗时间
    private String gameType;//游戏类型
    private String outcome;//游戏结果 0-失败 1-胜利


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }
}
