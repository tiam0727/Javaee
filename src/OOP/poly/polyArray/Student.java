package OOP.poly.polyArray;

public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //重写父类 say
    @Override
    public String say() {
        return "学生 " + super.say() + " score=" + score;
    }

    //特有的方法
    public void study() {
        System.out.println("学生 " + getName() + " 正在学 java...");
    }
}
