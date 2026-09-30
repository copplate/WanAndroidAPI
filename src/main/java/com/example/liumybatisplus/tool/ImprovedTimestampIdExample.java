package com.example.liumybatisplus.tool;

import java.util.Random;

public class ImprovedTimestampIdExample {
    public static Long getNormalId() {
        long uniqueId = System.currentTimeMillis() + new Random().nextInt(1000);
        System.out.println("Generated Unique ID: " + uniqueId);
        return uniqueId;
    }
}
