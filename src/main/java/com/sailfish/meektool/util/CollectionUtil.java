package com.sailfish.meektool.util;

/**
 * 集合相关工具类
 * Created by travis on 2016/10/24.
 */
public class CollectionUtil {

    private CollectionUtil() {
        //静态类不可实例化
    }


    /**
     * 数组是否为空
     *
     * @param array 数组
     * @param <T>
     * @return 是否为空
     */
    public static <T> boolean isEmpty(final T[] array){
        return array == null || array.length == 0;
    }
}
