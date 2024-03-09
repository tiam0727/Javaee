package com.jj.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: xj
 * @description: 演示迭代器的使用
 * @dateTime: 2024/3/9 23:08
 **/
public class CollectionIterator {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Book("三国演义","罗贯中",20));
        arrayList.add(new Book("红楼梦","曹雪芹",30));
        arrayList.add(new Book("西游记","吴承恩",20));
        arrayList.add(new Book("水浒传","施耐庵",20));
        //先得到arrayList的迭代器
        Iterator iterator = arrayList.iterator();
        //使用while循环遍历
//        while(iterator.hasNext()){
//            //返回下一个对象，类型是Object
//            Object next = iterator.next();//编译类型是object，运行类型取决于具体存放的对象
//            System.out.println(next);
//        }
        
        //快捷键，快速生成while循环 itit
        //使用ctrl+j查看当前的所有可使用的快捷键

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //当迭代器退出while循环后iterator指向最后的元素
        //iterator.next();
        /**
         * 再次使用next方法就会抛异常
         * Exception in thread "main" java.util.NoSuchElementException
         * 	at java.util.ArrayList$Itr.next(ArrayList.java:864)
         * 	at com.jj.collection_.CollectionIterator.main(CollectionIterator.java:35)
         *
         * 	如果希望再次遍历，需要重置迭代器
         * 	即再次调用 iterator = arrayList.iterator();
         *
         */
    }
}
class Book{
    private String name;
    private String author;
    private double prize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
                ", author='" + author + '\'' +
                ", prize=" + prize +
                '}';
    }

    public Book(String name, String author, double prize) {
        this.name = name;
        this.author = author;
        this.prize = prize;
    }
}
