package com.example.demo.domain;

import com.example.demo.CommonConfig.ResultCode;

public class ResultVO<T> {
    private int code;
    private String msg;
    private T data;
    public ResultVO(T data){
        this(ResultCode.SUCCESS,data);
    }
    public ResultVO(ResultCode resultCode,T data){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
