package com.lcc;

import com.lcc.entory.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2021/4/20 11:31
 */
public class PersonTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        //筛选员工中工资高于8000的人，并形成新的集合
      /*  List<String> collect = personList.stream().filter(x -> x.getSalary() > 8000).map(Person::getUsername).collect(Collectors.toList());
        System.out.print("高于8000的员工姓名：" + collect);*/

       /* Optional<Person> max = personList.stream().max(Comparator.comparingInt(Person::getSalary));
        System.out.println("员工工资最大值：" + max.get().getSalary());*/

        personList.stream().map(person -> {
            Person personNew = new Person(person.getUsername(), 0, 0, null, null);
            personNew.setSalary(person.getSalary() + 10000);
            return personNew;
        }).collect(Collectors.toList());
    }
}