package com.jj.generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author: xj
 * @description: 泛型使用举例
 * @dateTime: 2024/3/19 11:50
 **/
public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack", 18));
        students.add(new Student("tom", 28));
        students.add(new Student("mary", 19));
        HashMap<String, Student> studentHashMap = new HashMap<>();
        //使用增强for
//        for (Student student : students) {
//            studentHashMap.put(student.getName(), student);
//        }
        //使用迭代器
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            studentHashMap.put(student.getName(), student);
        }
        System.out.println(studentHashMap);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}