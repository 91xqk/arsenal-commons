package org.sunny.arsenal.order;

import org.apache.commons.collections4.MultiMap;
import org.sunny.arsenal.util.CommonUtils;
import org.sunny.arsenal.util.DateUtils;
import org.sunny.arsenal.util.StringUtils;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ArsenalOrder {


    private String orderCode = new String();

    public ArsenalOrder() {
        orderCode = "";
    }

    public ArsenalOrder(String custom) {
        orderCode = custom;
    }

    /*
     * 功能描述: 追加自定义格式
     * 〈〉
     * @Param: []
     * @Return: java.lang.String
     * @Author: zhaoyang
     * @Date: 2020/9/7 11:51 上午
     */
    public void put(CustomType key, Object format) {
        orderCode += getAttrByCustomType(key, format);
    }

    /*
     * 功能描述: 自定义订单编号生成
     * 〈〉
     * @Param: []
     * @Return: java.lang.String
     * @Author: zhaoyang
     * @Date: 2020/9/7 11:51 上午
     */
    public String generate() {

        return orderCode;
    }


    /*
     * 功能描述:
     * 〈〉
     * @Param: []
     * @Return: java.lang.String
     * @Author: zhaoyang
     * @Date: 2020/9/7 3:31 下午
     */
    public static String dateOrderCodeGenerate() {
        return dateOrderCodeGenerate("");
    }

    /*
     * 功能描述:
     * 〈〉
     * @Param: [format]
     * @Return: java.lang.String
     * @Author: zhaoyang
     * @Date: 2020/9/7 3:31 下午
     */
    public static String dateOrderCodeGenerate(String format) {
        String orderCode = new String();
        if (StringUtils.isEmpty(format)) {
            format = "yyyy-MM-dd HH:ss:mm";
        }
        orderCode.concat(DateUtils.nowString(format));
        return orderCode;
    }


    public static String timestampOrderCodeGenerate() {
        return Integer.toString(DateUtils.getSecondTimestamp(new Date()));
    }

    public static String UUIDOrderCodeGenerate() {
        return CommonUtils.getUUIDString();
    }

    private static String getAttrByCustomType(CustomType orderCustomType, Object format) {

        switch (orderCustomType) {
            case CUSTOM:
                return format.toString();
            case DATE:
                return DateUtils.nowString(format.toString());
            case RANDOMNO:
                return CommonUtils.getRandomNumber(StringUtils.parseInt(format.toString()));
            default:
                return "";
        }

    }


}
