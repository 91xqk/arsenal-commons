package org.sunny.arsenal.util;

import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponeUtils {
    /*
     * 功能描述: 输出自定义消息及code
     * 〈〉
     * @Param: [response, code, msg]
     * @Return: void
     * @Author: zhaoyang
     * @Date: 2020/8/17 4:13 下午
     */
    public static void write(HttpServletResponse response, int code, String msg) throws IOException, JSONException {
        response.setStatus(code);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        JSONObject res = new JSONObject();
        res.put("code", code);
        res.put("msg", msg);
        PrintWriter out = null;
        out = response.getWriter();
        out.write(res.toString());
        out.flush();
        out.close();

    }
}
