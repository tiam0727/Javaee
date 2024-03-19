package com.jj.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/19 12:04
 **/
public class GenericExercise02 {
    static class MyDate implements Comparable {
        private int year;
        private int month;

        @Override
        public String toString() {
            return year + "-" + month + "-" + day;
        }

        private int day;

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

        @Override
        public int compareTo(Object o) {
            if (o instanceof MyDate) {
//                MyDate myDate = (MyDate) o;
//                if (myDate.getYear() > this.getYear()) {
//                    return -1;
//                } else if (myDate.getYear() == this.getYear()) {
//                    if (myDate.getMonth() > this.getMonth()) {
//                        return -1;
//                    } else if (myDate.getMonth() == this.getMonth()){
//                        if(myDate.getDay()>this.getDay()){
//                            return -1;
//                        } else if (myDate.getDay()==this.getDay()) {
//                            return 0;
//                        }else {
//                            return 1;
//                        }
//                    }else{
//                        return 1;
//                    }
//                } else {
//                    return 1;
//                }
                //优化写法
                int yearMin = this.getYear() - ((MyDate) o).getYear();
                if (yearMin != 0) {
                    return yearMin;
                }
                int monthMin = this.getMonth() - ((MyDate) o).getMonth();
                if (monthMin != 0) {
                    return monthMin;
                }
                return this.getDay() - ((MyDate) o).getDay();

            } else {
                return 0;
            }
        }
    }

    static class Employee {
        private String name;
        private double sal;
        private MyDate birthday;

        @Override
        public String toString() {
            return "name='" + name + '\'' +
                    ", sal=" + sal +
                    ", birthday=" + birthday;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSal() {
            return sal;
        }

        public void setSal(double sal) {
            this.sal = sal;
        }

        public MyDate getBirthday() {
            return birthday;
        }

        public void setBirthday(MyDate birthday) {
            this.birthday = birthday;
        }

        public Employee(String name, double sal, MyDate birthday) {
            this.name = name;
            this.sal = sal;
            this.birthday = birthday;
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 20000, new MyDate(1980, 12, 11)));
        employees.add(new Employee("jack", 12000, new MyDate(2001, 12, 12)));
        employees.add(new Employee("tom", 50000, new MyDate(1980, 12, 10)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().equals(o2.getName()) || o1.getName() == o2.getName()) {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                } else {
                    return o2.getName().compareTo(o1.getName());
                }
            }
        });
        System.out.println(employees);
    }

}


