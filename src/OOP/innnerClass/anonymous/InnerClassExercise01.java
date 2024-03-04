package OOP.innnerClass.anonymous;

/**
 * @author: 徐杰
 * @description: 匿名内部类最佳实践
 * @dateTime: 2024/3/4 15:23
 * @return
 **/
public class InnerClassExercise01 {
    public static void main(String[] args) {
        //匿名内部类可以当作实参传递 简洁高效
        f1(new AA() {
            @Override
            public void show() {
                System.out.println("这是一只狗");
            }
        });

        //传统方法
        f1(new Dog());
    }
    //静态方法，形参是接口类型
    public static void f1(AA aa){
        aa.show();
    }
}
//接口
interface AA{
     void show();
}
//类-》实现接口 ——》编程领域的硬编码
class Dog implements AA{

    @Override
    public void show() {
        System.out.println("这是一只Dog");
    }
}
