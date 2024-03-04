package innnerClass.LocalInnerClass;

/**
 * @author: 徐杰
 * @description: 演示局部内部类的使用
 * @dateTime: 2024/3/2 18:09
 * @return
 **/
public class LocalInnerClass {
    public static void main(String[] args) {
        //演示一把
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("outer02的hashcode "+outer02);
    }
}

class Outer02 {//外部类
    private int n1 = 100;

    private void m2() {
        System.out.println("Outer02 m2() ");
//        new Inner02();//这种声明是不被允许的 因为Inner02相当于一个普通局部变量。
    }

    public void m1() {//方法
        //1. 局部内部类是定义在外部类的局部位置，通常在方法
        //3. 不能添加访问修饰符，因为他的地位是一个局部变量，但是可以使用final修饰
        //4. 作用域：仅仅在定义他的方法或者代码块中
        class Inner02 {//局部内部类（本质仍然是一个类）
            private int n1 = 800;

            // 2. 可以直接访问外部类的所有成员，包含私有的
            public void f1() {
                //5. 局部内部类可以直接访问外部类的成员，比如下面外部类n1和m2（）
                //7. 如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员需要使用 外部类名.this.成员 去访问
                //   TODO 解读: Outer02.this本质时外部类的对象，即那个对象调用了m1，Outer02.this就是那个对象
                System.out.println("n1 = " + n1 + "外部类的n1=" + Outer02.this.n1);
                System.out.println("Outer02.this的hashcode "+Outer02.this);
                m2();
            }

        }
        //6. 外部类可以在方法中直接创建inner02对象，然后直接调用方法

        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
//    {
//        //代码块
//        class inner03{
//
//        }
//    }

}
