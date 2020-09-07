package org.sunny.arsenal;

/*
 * 功能描述:ActionResult
 * 〈〉
 * @Param:
 * @Return:
 * @Author: zhaoyang
 * @Date: 2020/9/7 11:56 上午
 */
public class R {
    private int code;
    private Object data;
    private String msg;

    public R() {
    }

    public R(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public R(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static R success(Object data) {
        return new R(0, data);
    }

    public static R fail(String msg) {
        return new R(-1, "", msg);
    }

    public static R fail(int code, String msg) {
        return new R(code, "", msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
