package com.jj.wrapper.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/9 15:21
 **/
public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("aa", 200);
        books[1] = new Book("bb", 20);
        books[2] = new Book("cc", 22);
        books[3] = new Book("dd", 20.1);
        books[4] = new Book("ff", 55);
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                //return (int)(o2.getPrize()- o1.getPrize()); 错误的写法,由于高精度转低精度会出现精度损失，可能会出现预料之外的错误
                //如：[Book{name='aa', prize=200.0}, Book{name='ff', prize=55.0}, Book{name='cc', prize=22.0}, Book{name='bb', prize=20.0}, Book{name='dd', prize=20.1}]
                double res = o2.getPrize() - o1.getPrize();
                if (res > 0) {
                    return 1;
                } else if (res == 0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        System.out.println(Arrays.toString(books));

    }

}

class Book {
    private String name;
    private double prize;

    public Book(String name, double prize) {
        this.name = name;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", prize=" + prize +
                '}';
    }
}
