package com.jj.collection_.set.exercise;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/10 17:34
 **/
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<Employee>();
        employees.add(new Employee("tugou",10,new MyDate(2002,2,2)));
        employees.add(new Employee("tugou",10,new MyDate(2002,1,2)));
        employees.add(new Employee("tugou",10,new MyDate(2002,2,2)));
        System.out.println(employees);
    }
}
class Employee{
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday ;
    }

    private String name;
    private int age;
    private MyDate birthday;

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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
}
class MyDate{
    private int year;
    private int month;

    @Override
    public String toString() {
        return   year +
                "-" + month +
                "-" + day;
    }

    private int day;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}