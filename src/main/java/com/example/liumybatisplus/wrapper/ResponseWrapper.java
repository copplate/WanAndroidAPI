package com.example.liumybatisplus.wrapper;

/**
 * @author wangyc
 * @date 2026-08-23 14:07:29
 */
// ResponseWrapper.java
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseWrapper<T> {
    private int errorCode;
    private String errorMsg;
    private T data;

    // 快捷成功响应方法
    public static <T> ResponseWrapper<T> success(T data) {
        return new ResponseWrapper<>(0, "", data);
    }

    // 快捷失败响应方法
    public static <T> ResponseWrapper<T> error(int code, String msg) {
        return new ResponseWrapper<>(code, msg, null);
    }
}
