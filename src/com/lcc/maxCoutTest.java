package com.lcc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2021/4/20 13:51
 */

//案例一：获取String集合中最长的元素。
public class maxCoutTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");

        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        System.out.println("最长的字符串："+max.get());
    }
}