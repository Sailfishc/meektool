package com.sailfish.meektool.util;

/**
 * 转型操作工具类
 * Created by travis on 2016/10/24.
 */
public class CastUtil {

    /**
     * 转为String类型
     * @param obj
     * @return
     */
    public static String castString(Object obj) {
        return castString(obj, "");
    }

    /**
     * 转为string类型，可指定默认值
     * @param obj
     * @param defaultValue
     * @return
     */
    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为double类型
     * @param obj
     * @return
     */
    public static double castDouble(Object obj) {
        return castDouble(obj, 0);
    }


    /**
     * 转为double类型，提供默认值
     * @param obj
     * @param defaultValue
     * @return
     */
    public static double castDouble(Object obj, double defaultValue) {
        double doubleValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    doubleValue = Double.parseDouble(strValue);
                }catch (NumberFormatException e){
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }


    /**
     *转为long类型
     * @param obj
     * @return
     */
    public static long castLong(Object obj) {
        return castLong(obj, 0);
    }

    /**
     * 转为long类型，提供默认值
     * @param obj
     * @param defaultValue
     * @return
     */
    public static long castLong(Object obj, long defaultValue) {
        long longValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为int类型
     * @param obj
     * @return
     */
    public static int castInt(Object obj) {
        return castInt(obj, 0);
    }

    /**
     * 转为int类型，提供默认值
     * @param obj
     * @param defaultValue
     * @return
     */
    public static int castInt(Object obj, int defaultValue) {
        int intValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }


    /**
     * 转为boolean类型
     * @param obj
     * @return
     */
    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }

    /**
     * 转为boolean类型
     * @param obj
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean flag = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    flag = Boolean.parseBoolean(strValue);
                } catch (NumberFormatException e) {
                    flag = defaultValue;
                }
            }
        }
        return flag;
    }
}
