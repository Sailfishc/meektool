package com.sailfish.meektool.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 分页工具类
 * Created by travis on 2016/10/24.
 */
public final class PageUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(PageUtil.class);

    /**
     * 将页数和乜嘢条目数转换为开始位置和结束位置
     * 此方法用于不包括结束位置的分页方法
     * 例如：
     *      页码：1，每页10条， [0,10]
     *      页码：2，每页10条， [10,20]
     * @param pageNo 页码（从1计数）
     * @param countPerPage 每页条目数
     * @return 第一个数为开始位置，第二个数为结束位置
     */
    public static int[] transToStartEnd(int pageNo, int countPerPage) {
        if (pageNo < 1) {
            pageNo = 1;
        }

        if (countPerPage < 1) {
            countPerPage = 0;
            LOGGER.warn("Count per page [{}] is not valid!", countPerPage);
        }

        int start = (pageNo - 1) * countPerPage;
        int end = start + countPerPage;

        return new int[]{start, end};
    }

    /**
     * 根据总的数据计算总的页数
     * @param totalCount
     * @param numberPage
     * @return
     */
    public static int totalPage(int totalCount, int numPerPage) {
        if (numPerPage == 0) {
            return 0;
        }
        return totalCount % numPerPage == 0 ? (totalCount / numPerPage) : (totalCount / numPerPage + 1);
    }
}
