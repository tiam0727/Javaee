package innnerClass;

/**
 * @author: 徐杰
 * @description: 内部类演示
 * @dateTime: 2024/3/2 17:54
 * @return
 **/
public class InnerClass01 {//外部其他类
    public static void main(String[] args) {

    }
}

class Outer {//外部类
    private int n1 = 100;

    public Outer(int n1) {
        this.n1 = n1;
    }
    //方法
    public void m1(){
        System.out.println("m1()");
    }
    //代码块
    {
        System.out.println("代码块.....");
    }
    class Inner{//内部类，在Outer内部

    }

}
