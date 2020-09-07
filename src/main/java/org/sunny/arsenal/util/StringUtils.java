package org.sunny.arsenal.util;

import org.sunny.arsenal.EnableArsenal;

@EnableArsenal
public class StringUtils extends UtilsBase {
    /*
     * 功能描述: 判断字符串是否为空
     * 〈〉
     * @Param: [str]
     * @Return: boolean
     * @Author: zhaoyang
     * @Date: 2020/9/7 4:00 下午
     */
    public static boolean isEmpty(CharSequence str) {
        return org.apache.commons.lang3.StringUtils.isEmpty(str);
    }

    /*
     * 功能描述: 判断字符串是否不为空
     * 〈〉
     * @Param: [str]
     * @Return: boolean
     * @Author: zhaoyang
     * @Date: 2020/9/7 4:00 下午
     */
    public static boolean isNotEmpty(CharSequence str) {
        return org.apache.commons.lang3.StringUtils.isNoneEmpty(str);
    }

    /*
     * 功能描述: 如果str为空时，返回特定字符串
     * 〈〉
     * @Param: [str, refStr]
     * @Return: java.lang.String
     * @Author: zhaoyang
     * @Date: 2020/8/17 4:14 下午
     */
    public static String ifEmpty(CharSequence str, String refStr) {
        if (StringUtils.isEmpty(str)) {
            return refStr;
        }
        return (String) str;
    }

    /*
     * 功能描述: 判断字符串1是否包含字符串2
     * @Param:str1
     * @Param:str2
     * @Return: boolean
     * @Author: zhaoyang
     * @Date: 2020/8/17 4:12 下午
     */

    public static boolean any(String str1, String str2) {
        if (str1.indexOf(str2) != -1) {
            return true;
        }
        return false;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}
