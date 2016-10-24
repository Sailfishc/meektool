package com.sailfish.meektool.util;

import java.math.BigDecimal;

/**
 * 数字相关工具类
 * Created by travis on 2016/10/24.
 */
public class MathUtil {

    /**
     * 保留小数位
     * @param number 被保留小数的数字
     * @param digit 保留的小数位
     * @return 保留小数后的字符串
     */
    public static String roundStr(double number, int digit) {
        return String.format("%." + digit + 'f', number);
    }


    /**
     * 保留小数位
     * @param number  被保留小数的数字
     * @param digit  保留的小数位数
     * @return  保留小数后的字符串
     */
    public static double round(double number, int digit) {
        final BigDecimal bg = new BigDecimal(number);
        return bg.setScale(digit, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
