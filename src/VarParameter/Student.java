package VarParameter;

/**
 * @author: 徐杰
 * @description: 可变参数的实践
 * @dateTime: 2024/2/28 16:30
 * @return
 **/


public class Student {
    public String countScores(String name, double... scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return name + "有" + scores.length + "门成绩" + "总共的分数是" + sum;
    }
}
