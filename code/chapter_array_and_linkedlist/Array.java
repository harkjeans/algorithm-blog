package code.chapter_array_and_linkedlist;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Array {
    /* 随机访问数组元素 */
    static int randomAccess(int[] nums) {
        // 在区间 [0, nums.length) 中随机抽取一个数字
        int randomIndex = ThreadLocalRandom.current().nextInt(0, nums.length);
        int randomNum = nums[randomIndex];
        return randomNum;
    }


    public static void main(String[] args) {
        /* 初始化数组 */
        int[] arr = new int[5];
        System.out.println("数组 arr =" + Arrays.toString(arr));
        int[] nums = new int[]{1, 3, 2, 5, 4};
        System.out.println("数组 nums =" + Arrays.toString(nums));

        /* 随机访问数组元素 */
        int randomNum = randomAccess(nums);
        System.out.println("在nums中获取随机元素:" + randomNum);

    }
   
}
