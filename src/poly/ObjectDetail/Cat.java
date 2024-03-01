package poly.ObjectDetail;

public class Cat extends Animal {
    public void eat() {//方法重写
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {//Cat 特有方法
        System.out.println("猫抓老鼠");
    }
}
