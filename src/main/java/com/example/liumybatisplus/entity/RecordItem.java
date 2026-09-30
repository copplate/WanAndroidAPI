package com.example.liumybatisplus.entity;

import cn.hutool.core.date.DateTime;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

public class RecordItem {
    private String id;
    private DateTime startTime;
    private String userId;
    private String userName;
    private String mainRecordId;
    private String playRole;
    private Integer kScore;
    private Integer death;
    private Integer assist;
    private String score;
    private String equipment1;
    private String equipment2;
    private String equipment3;
    private String equipment4;
    private String equipment5;
    private String equipment6;


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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMainRecordId() {
        return mainRecordId;
    }

    public void setMainRecordId(String mainRecordId) {
        this.mainRecordId = mainRecordId;
    }

    public String getPlayRole() {
        return playRole;
    }

    public void setPlayRole(String playRole) {
        this.playRole = playRole;
    }

    public Integer getkScore() {
        return kScore;
    }

    public void setkScore(Integer kScore) {
        this.kScore = kScore;
    }

    public Integer getDeath() {
        return death;
    }

    public void setDeath(Integer death) {
        this.death = death;
    }

    public Integer getAssist() {
        return assist;
    }

    public void setAssist(Integer assist) {
        this.assist = assist;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getEquipment1() {
        return equipment1;
    }

    public void setEquipment1(String equipment1) {
        this.equipment1 = equipment1;
    }

    public String getEquipment2() {
        return equipment2;
    }

    public void setEquipment2(String equipment2) {
        this.equipment2 = equipment2;
    }

    public String getEquipment3() {
        return equipment3;
    }

    public void setEquipment3(String equipment3) {
        this.equipment3 = equipment3;
    }

    public String getEquipment4() {
        return equipment4;
    }

    public void setEquipment4(String equipment4) {
        this.equipment4 = equipment4;
    }

    public String getEquipment5() {
        return equipment5;
    }

    public void setEquipment5(String equipment5) {
        this.equipment5 = equipment5;
    }

    public String getEquipment6() {
        return equipment6;
    }

    public void setEquipment6(String equipment6) {
        this.equipment6 = equipment6;
    }
}
