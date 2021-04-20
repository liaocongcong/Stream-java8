package com.lcc;

import com.lcc.entory.Person;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2021/4/20 16:15
 */
public class StreamCollect {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 6, 3, 4, 6, 7, 9, 6, 20);

        List<Integer> listNew = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        Set<Integer> set = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));

        Map<?, Person> map = personList.stream().filter(p -> p.getSalary() > 8000)
                .collect(Collectors.toMap(Person::getUsername, p -> p));

        System.out.println("toList:" + listNew);
        System.out.println("toSet:" + set);
        System.out.println("toMap:" + map.toString());

    }
}