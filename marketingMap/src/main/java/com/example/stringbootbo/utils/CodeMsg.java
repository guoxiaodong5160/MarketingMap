package com.example.stringbootbo.utils;

public class CodeMsg {
    private int retCode;
    private String message;
    // 按照模块定义CodeMsg
    // 通用异常
    public static CodeMsg SUCCESS = new CodeMsg(200, "success");
    public static CodeMsg PARAMETER_ISNULL = new CodeMsg(201, "参数错误");
    public static CodeMsg NOT_FIND_DATA = new CodeMsg(202, "key无效");

    private CodeMsg(int retCode, String message) {
        this.retCode = retCode;
        this.message = message;
    }

    public int getRetCode() {
        return retCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
