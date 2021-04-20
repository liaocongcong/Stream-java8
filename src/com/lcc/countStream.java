package com.lcc;

import com.lcc.entory.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description:Collectors提供了一系列用于数据统计的静态方法：
 *
 * 计数：count
 * 平均值：averagingInt、averagingLong、averagingDouble
 * 最值：maxBy、minBy
 * 求和：summingInt、summingLong、summingDouble
 * 统计以上所有：summarizingInt、summarizingLong、summarizingDouble
 * 案例：统计员工人数、平均工资、工资总额、最高工资。
 * @Author: liaocongcong
 * @Date: 2021/4/20 16:29
 */
public class countStream {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));

        // 求总数
       Long count= personList.stream().collect(Collectors.counting());
       //求平均工资
       Double average=personList.stream().collect(Collectors.averagingDouble(Person::getSalary));

        List<Person> collect = personList.stream().distinct().collect(Collectors.toList());
    }
}