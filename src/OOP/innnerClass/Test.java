package OOP.innnerClass;

public class Test {//外部类

    public Test() {//构造器
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }

    class Inner { //内部类，成员内部类
        public int a = 5;
    }
    Inner getInstance(){
        return new Inner();
    }

    public static void main(String[] args) {
        Test t = new Test();
        //利用对象t调用方法创建对象r
        Inner r = t.new Inner();//5
        Inner r2 = t.getInstance();//5
//        String[] strings={""};
//        t.main(strings);

        System.out.println(r.a);//5
    }

//     static class Inner {
//        public int a = 5;
//
//    }
}