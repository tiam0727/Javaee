/**
 * @author: 徐杰
 * @description: 冒泡排序
 * @dateTime: 2024/2/21 19:30
 * @return
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 5, 6, 9, 8, 1, 2};
        for (int a : nums) {
            System.out.println(a);
        }
        System.out.println("==============");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int a : nums) {
            System.out.println(a);
        }
    }
}
