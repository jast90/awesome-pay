package io.github.jast90.pay.util;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    /**
     * 获取当前时间字符串
     *
     * @return
     */
    public static String getNowString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowStr = simpleDateFormat.format(new Date());
        return nowStr;
    }

    public static void main(String[] args) {
        System.out.println(getNowString());
    }
}
