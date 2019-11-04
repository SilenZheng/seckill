package com.silen.seckill.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


/**
 *
 * @author zero
 * @date 2016/4/19
 */

public class DateUtil {

    private static final ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>();

    private static final Object object = new Object();

    /**
     * 获取SimpleDateFormat
     * @param pattern 日期格式
     * @return SimpleDateFormat对象
     * @throws RuntimeException 异常：非法日期格式
     */
    private static SimpleDateFormat getDateFormat(String pattern) throws RuntimeException {
        SimpleDateFormat dateFormat = threadLocal.get();
        if (dateFormat == null) {
            synchronized (object) {
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(pattern);
                    dateFormat.setLenient(false);
                    threadLocal.set(dateFormat);
                }
            }
        }
        dateFormat.applyPattern(pattern);
        return dateFormat;
    }


    /**
     * 获取日期。默认yyyy-MM-dd格式。失败返回null。
     * @param date 日期
     * @return 日期
     */
    public static String getDateString(Date date) {
        String dateString = null;
        if (date != null) {
            try {
                dateString = getDateFormat("yyyy-MM-dd").format(date).replace("-","");
            } catch (Exception e) {
            }
        }
        return dateString;
    }


    /**
     * 获取今天零点的时间戳
     * @return
     */
    public static long getTodayZeroOclockTime(){
        long current = System.currentTimeMillis();
        long zero = current/(1000*3600*24)*(1000*3600*24) - TimeZone.getDefault().getRawOffset();
        return zero;
    }

    /**
     * 将日期转化为日期字符串。失败返回null。
     * @param date 日期
     * @param pattern 日期格式
     * @return 日期字符串
     */
    public static String DateToString(Date date, String pattern) {
        String dateString = null;
        if (date != null) {
            try {
                dateString = getDateFormat(pattern).format(date);
            } catch (Exception e) {
            }
        }
        return dateString;
    }

    /**
     * 将时间戳转换为时间
     */
    public static String stampToDate(Long s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(s);
        res = simpleDateFormat.format(date);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getDateString(new Date()));
    }



}
