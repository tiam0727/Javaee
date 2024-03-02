package interface_;

/**
 * @author: 徐杰
 * @description: 接口细节
 * @dateTime: 2024/3/1 17:28
 * @return
 **/
public interface Interface02 {
    //写属性
    public int n1 = 10;

    //写方法
    //在接口中，抽象方法可以省略关键字abstract
    public void hi();

    //jdk8之后可以有默认的实现方法,需要使用default关键字修饰
    default public void ok() {
        System.out.println("ok");
    }
    //在jdk8之后，可以有静态方法
    public static void cry(){
        System.out.println("cry....... ");
    }

}
