package com.jj.collection_.homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/19 10:31
 **/
public class HomeWork03 {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person p1 = new Person("AA", 1001);
        people.add(p1);
        Person p2 = new Person("BB", 1002);
        people.add(p2);
        p1.name="cc";
        System.out.println(people);
        people.add(new Person("AA",1001));
        System.out.println(people);
        people.add(new Person("CC",1002));
        System.out.println(people);
//        people.add(new Person("CC",100));
    }
}
class Person{
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String name;
    public int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
