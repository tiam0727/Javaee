package com.jj.collection_.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author: xj
 * @description: 练习
 * @dateTime: 2024/3/10 17:03
 **/
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee("person1",10));
        employees.add(new Employee("person2",20));
        employees.add(new Employee("person3",30));
        employees.add(new Employee("person3",20));
        employees.add(new Employee("person3",30));
        System.out.println(employees);
    }
}

class Employee {
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new RuntimeException("名字不能为空");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
