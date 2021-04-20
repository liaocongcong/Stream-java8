package com.lcc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2021/4/20 11:22
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 6, 9, 3, 8, 2, 1);

        //遍历输出符合条件元素
        list.stream().filter(x->x>6).forEach(System.out::println);
        //匹配第一个
        Optional<Integer> first = list.stream().filter(x -> x > 6).findFirst();

        //匹配任意一个
        Optional<Integer> any = list.stream().filter(x -> x > 6).findAny();

        // 是否包含符合特定条件的元素
        boolean b = list.stream().anyMatch(x -> x < 6);

        System.out.println("匹配第一个值：" + first.get());
        System.out.println("匹配任意一个值：" + any.get());
        System.out.println("是否存在大于6的值：" + b);
    }
}