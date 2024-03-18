package com.jj.collection_.homework;

import java.util.ArrayList;

/**
 * @author: xj
 * @description: zy 1
 * @dateTime: 2024/3/18 22:34
 **/
public class Homework01 {
    public static void main(String[] args) {
        ArrayList<News> arrayList = new ArrayList<News>();
        News news1 = new News("新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧");
        News news2 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");
        arrayList.add(news1);
        arrayList.add(news2);
        for (int i = arrayList.size() - 1; i >= 0; i--) {
//            StringBuilder title = new StringBuilder(arrayList.get(i).getTitle());
//            if (title.length()>15){
//                title.delete(15,title.length()-1).append("...");
//            }
//            arrayList.get(i).setTitle(String.valueOf(title));
            News news = arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));
        }
        System.out.println(arrayList);
    }

    public static String processTitle(String title) {
        if (title.length() > 15) {
            String substring = title.substring(0, 14);
            return substring + "...";
        } else return title;
    }
}

class News {
    private String title;
    private String content;

    @Override
    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News(String title) {
        this.title = title;
    }
}
