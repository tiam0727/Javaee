package poly.DynamicBinding;

/**
 * Java动态绑定机制：
 * 1. 当调用对象方法时，该方法会和该对象的内存地址/运行类型绑定
 * 2. 当调用对象属性时，没有动态绑定机制，那里声明，那里使用，按照作用域+继承机制
 */
public class DynamicBinding {
    public static void main(String[] args) {
        //TODO a 的编译类型 A, 运行类型 B
        A a = new B();//向上转型
        System.out.println(a.sum());//?40 -> 30
        System.out.println(a.sum1());//?30-> 20
        System.out.println("a="+a.getI());
        System.out.println(a.i);
        B c = (B) a;
        System.out.println(c.i);
    }
}

class A {//父类
    public int i = 10;

    //动态绑定机制:
    public int sum() {//父类 sum()
        return getI() + 10;//20 + 10

    }

    public int sum1() {//父类 sum1()
        System.out.println("父类方法");
        return i + 10;//10 + 10
    }

    public int getI() {//父类 getI
        return i;
    }
}

class B extends A {//子类
    public int i = 20;

    // public int sum() {
// return i + 20;
// }
    public int getI() {//子类 getI()
        return i;
    }

//    public int sum1() {
//        System.out.println("子类方法");
//        return i + 10;
//    }
}