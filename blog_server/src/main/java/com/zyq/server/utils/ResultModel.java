package com.zyq.server.utils;

import java.io.Serializable;

/**
 * @author 张亚卿
 * @date 2021年1月24日 11:41:15
 * 响应返回类
 */
public class ResultModel implements Serializable {
    /**
     * 状态码 0失败 1成功
     */
    private String code;
    /**
     * 消息
     */
    private String msg;
    /**
     * 数据
     */
    private Object data;

    public ResultModel() {

    }

    public ResultModel(String code ,String msg ,Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultModel{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
