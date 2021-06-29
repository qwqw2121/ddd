package com.example.ecplatform.pojo;

import java.io.Serializable;

public class ServResponse <T> implements Serializable {
    private int status; //返回状态
    private String msg;
    private T date;

    public ServResponse() {
       ;
    }

    public ServResponse(int status, String msg, T date) {
        this.status = status;
        this.msg = msg;
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}
