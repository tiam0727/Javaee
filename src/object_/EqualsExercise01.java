package object_;

/**
 * 练习重写equals方法
 */
public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, '男');
        Person person2 = new Person("jack", 20, '男');
        System.out.println(person1.equals(person2));//假
    }
}

//判断两个 Person 对象的内容是否相等，
//如果两个 Person 对象的各个属性值都一样，则返回 true，反之 false
class Person { //extends Object
    private String name;
    private int age;
    private char gender;

    //重写 Object 的 equals 方法
    public boolean equals(Object obj) {
//判断如果比较的两个对象是同一个对象，则直接返回 true
        if (this == obj) {
            return true;
        }
//类型判断
        if (obj instanceof Person) {//是 Person，我们才比较
//进行 向下转型, 因为我需要得到 obj 的 各个属性
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
//如果不是 Person ，则直接返回 false
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}