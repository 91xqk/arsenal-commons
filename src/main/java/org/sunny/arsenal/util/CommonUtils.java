package org.sunny.arsenal.util;

import org.sunny.arsenal.EnableArsenal;

import java.util.Random;
import java.util.UUID;

@EnableArsenal
public class CommonUtils extends UtilsBase {
    /*
     * 功能描述: 打印
     * 〈〉
     * @Param: [obj]
     * @Return: void
     * @Author: zhaoyang
     * @Date: 2020/9/4 3:20 下午
     */
    public static void print(Object obj) {
        System.out.println(obj);
    }

    /*
     * 功能描述: UUID
     * 〈〉
     * @Param: []
     * @Return: java.util.UUID
     * @Author: zhaoyang
     * @Date: 2020/9/4 3:20 下午
     */
    public static UUID getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid;
    }

    /*
     * 功能描述:String类型UUID
     * 〈〉
     * @Param:
     * @Return:
     * @Author: zhaoyang
     * @Date: 2020/9/4 3:20 下午
     */
    public static String getUUIDString() {
        return getUUIDString("NU");
    }

    public static String getUUIDString(String format) {
        String uuid = getUUID().toString();
        if (StringUtils.isEmpty(format)) {
            format = "N";
        }
        if (format.equals("N")) {
            return uuid.replace("-", "");
        }
        if (format.equals("U")) {
            return uuid.toUpperCase();
        }
        if (format.equals("NU")) {
            return uuid.replace("-", "").toUpperCase();
        }
        if (format.equals("L")) {
            return uuid.toLowerCase();
        }
        if (format.equals("NL")) {
            return uuid.replace("-", "").toLowerCase();
        }
        return getUUID().toString();
    }

    public static String getRandomNumber(int digit) {
        Random rand = new Random();
        String digitCode = new String();
        if (digit <= 0) {
            digit = 1;
        }
        for (int i = 0; i < digit; i++) {

            digitCode += rand.nextInt(10);
            CommonUtils.print(digitCode);
        }
        return digitCode;
    }
}
