package com.lcc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2021/4/20 16:06
 */
public class StreamReduce {
    public static void main(String[] args) {
        //案例一：求Integer集合的元素之和、乘积和最大值。

        List<Integer> list = Arrays.asList(1, 3, 2, 8, 11, 4);
        //求和方式
        Optional<Integer> sum = list.stream().reduce((x, y) -> x + y);
        //求和方式
        Optional<Integer> sum2 = list.stream().reduce(Integer::sum);

        // 求乘积
        Optional<Integer> product = list.stream().reduce((x, y) -> x * y);

        //求最大值
        // 求最大值方式1
        Optional<Integer> max = list.stream().reduce((x, y) -> x > y ? x : y);
        // 求最大值写法2
        Integer max2 = list.stream().reduce(1, Integer::max);
    }
}