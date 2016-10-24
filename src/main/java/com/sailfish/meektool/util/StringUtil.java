package com.sailfish.meektool.util;

/**
 * 字符串工具类
 * Created by travis on 2016/10/24.
 */
public class StringUtil {

    /**
     * 空格字符的字符串
     */
    public static final String SPACE = " ";

    /**
     * 空字符串
     */
    public static final String EMPTY = "";

    /**
     *换行字符串
     */
    public static final String LF = "\n";

    /**
     *回车键的字符串
     */
    public static final String CR = "\r";

    /**
     * 失败的索引搜索
     */
    public static final int INDEX_NOT_FOUND = -1;

    /**
     * 填充常数（S）可以扩展的最大大小
     */
    private static final int PAD_LIMIT = 8182;

    public StringUtil() {
        super();
    }

    /**
     * 字符串是否为空白，所为空白：
     * 1、为null
     * 2、为不可见字符，例如空格
     * 3、""
     * @param str 被检测字符串
     * @return 是否为空
     */
    public static boolean isBlank(String str){
        int length;

        if ((str == null) || ((length = str.length()) == 0)){
            return true;
        }

        for (int i = 0; i < length; i++) {
            //只要有一个非空字符就不是空字符
            if (false == Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    /**
     * 字符串是否不为空白，所为空白：
     * 1、为null
     * 2、为不可见字符，例如空格
     * 3、""
     * @param str 被检测字符串
     * @return 是否不为空
     */
    public static boolean isNotBlank(String str) {
        return false == isBlank(str);
    }

    /**
     * 是否包含空字符串
     * @param strs 字符串列表
     * @return 是否包含空字符串
     */
    public static boolean hasBlank(String... strs){
        if (CollectionUtil.isEmpty(strs)){
            return true;
        }

        for (String str : strs) {
            if (isBlank(str)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 给定所有字符串是否为空白
     *
     * @param strs 字符串
     * @return  所有字符串是否为空白
     */
    public static boolean isAllBlank(String... strs) {
        if (CollectionUtil.isEmpty(strs)) {
            return true;
        }

        for (String str : strs) {
            if (isNotBlank(str)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 字符串是否为空，空的定义：
     * 1、为null
     * 2、为""
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * 字符串是否为空，空的定义：
     * 1、为null
     * 2、为""
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return false == isEmpty(str);
    }

    /**
     * 是否包含空字符串：
     * 1、字符串全部为空
     * 2、字符串部分为空
     *
     * @param strs
     * @return 是否包含空字符串
     */
    public static boolean hasEmpty(String... strs) {
        if (CollectionUtil.isEmpty(strs)) {
            return true;
        }
        //遍历，判断是否为空
        for (String str : strs) {
            if (isEmpty(str)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 是否全部为空字符串
     * @param strs
     * @return
     */
    public static boolean isAllEmpty(String... strs) {
        if (CollectionUtil.isEmpty(strs)) {
            return true;
        }

        for (String str : strs) {
            if (isNotEmpty(str)) {
                return false;
            }
        }
        return true;
    }
}
