package com.jj.exception_.try_;

/**
 * @author: 徐杰
 * @description: 可以同时捕获多个异常，但是需要将子类异常写在前面,只会捕获第一个异常
 *
 * @dateTime: 2024/3/5 16:32
 **/
public class TryCatchDetail02 {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());//NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;//ArithmeticException
        } catch (NullPointerException ne){
            System.out.println("空指针异常"+ne.getMessage());
        }catch (ArithmeticException ae){
            System.out.println("算数异常"+ae.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        finally {
//            int n1 = 10;
//            int n2 = 0;
//            int res = n1 / n2;//ArithmeticException
//        }
    }
}

class Person {
    private String name = "jack";

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
