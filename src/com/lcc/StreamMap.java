package com.lcc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2021/4/20 14:12
 */
public class StreamMap {
    public static void main(String[] args) {

        //英文字符串数组的元素全部改为大写。整数数组每个元素+3
        String[] strArr = { "abcd", "bcdd", "defde", "fTr" };
        List<String> collect = Arrays.stream(strArr).map(String::toUpperCase).collect(Collectors.toList());

        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> collect1 = intList.stream().map(x -> x + 3).collect(Collectors.toList());

        System.out.println("每个元素大写：" + collect);
        System.out.println("每个元素+3：" + collect1);

    }
}