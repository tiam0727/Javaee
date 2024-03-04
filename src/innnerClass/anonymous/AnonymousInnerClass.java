package innnerClass.anonymous;

/**
 * @author: 徐杰
 * @description: 演示匿名内部类的使用
 * @dateTime: 2024/3/4 12:36
 * @return
 **/
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    //外部类
    private int n1 = 10;//属性

    public void method() {
        /**
         * 方法
         *  基于接口的匿名内部类
         *  1. 需求 想使用接口A，并创建对象
         *  2. 传统方式：创建类实现接口，再实例化对象
         *  A tiger = new Tiger();
         *  t.cry();
         *
         *  3. 现在的需求是 类只使用一次，后面不在使用
         *  4. 使用匿名内部类简化开发
         *  5.  tiger编译类型 A
         *  6.  tiger运行类型  就是匿名内部类 XXX=>Outer04$1
         *  我们看底层 会分配类名Outer04$1
         *  class Outer04$1 implement A{
         *       @Override
         *       public void cry() {
         *           System.out.println("老虎叫--------");
         *       }
         *  }
         */
        //7. jdk底层在创建匿名内部类Outer04$1，立即马上就创建了Outer04$1实例，并把地址返回给tiger
        A tiger = new A() {
            @Override
            public void cry() {
                System.out.println("老虎叫--------");
            }
        };
        System.out.println("tiger的运行类型" + tiger.getClass());
        tiger.cry();

    }
}

interface A {
    void cry();
}

//class Tiger implements A{
//    @Override
//    public void cry() {
//        System.out.println("老虎叫------");
//    }
//}
class Father {
    public String name;

    public Father(String name) {
        this.name = name;
    }
}
