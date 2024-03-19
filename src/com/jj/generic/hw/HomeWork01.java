package com.jj.generic.hw;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/19 19:17
 **/
public class HomeWork01 {
    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001", new User("Jack", 1, 10));
        userDAO.save("002", new User("Jim", 2, 15));
        userDAO.save("003", new User("John", 3, 20));
        System.out.println(userDAO.list());
    }

}

class User {
    private String name;
    private int id;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}

class DAO<T> {
    private Map<String, T> m = new HashMap<>();

    public void save(String id, T entity) {
        m.put(id, entity);
    }


    public T get(String id) {
        return m.get(id);
    }

    public void update(String id, T entity) {
        m.put(id, entity);
    }

    public List<T> list() {
        List<T> ts = new ArrayList<>();
        Set<Map.Entry<String, T>> entries = m.entrySet();
        for (Map.Entry<String, T> entry : entries) {
            ts.add(entry.getValue());
        }
        return ts;
    }

    public void delete(String id) {
        m.remove(id);
    }
}
