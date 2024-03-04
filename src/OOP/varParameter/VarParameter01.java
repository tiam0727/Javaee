package OOP.varParameter;

public class VarParameter01 {

    /**
     * 输入人的姓名和任意多的科目
     * 返回一个人的姓名和对应的成绩，封装成一个可变参数
     */

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.countScores("guoziyang ",10.1,10.23,10.3,10.2));

    }




}
