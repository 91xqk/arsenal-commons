package org.sunny.arsenal.util;

import org.sunny.arsenal.EnableArsenal;

import java.text.SimpleDateFormat;
import java.util.Date;

@EnableArsenal
public class DateUtils extends UtilsBase  {
    public static String nowString()
    {
        return nowString("");
    }
    public static String nowString(String format)
    {
        if(StringUtils.isEmpty(format))
        {
            format="yyyy-MM-dd HH:mm:ss";
        }

        SimpleDateFormat formatter= new SimpleDateFormat(format);
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        return formatter.format(date);
    }
    /**
     * 获取精确到秒的时间戳
     * @return
     */
    public static int getSecondTimestamp(Date date){
        if (null == date) {
            return 0;
        }
        String timestamp = String.valueOf(date.getTime());
        int length = timestamp.length();
        if (length > 3) {
            return Integer.valueOf(timestamp.substring(0,length-3));
        } else {
            return 0;
        }
    }
    /**
     * 获取精确到秒的时间戳
     * @param date
     * @return
     */
    public static int getSecondTimestampFunc2(Date date){
        if (null == date) {
            return 0;
        }
        String timestamp = String.valueOf(date.getTime()/1000);
        return Integer.valueOf(timestamp);
    }
}
