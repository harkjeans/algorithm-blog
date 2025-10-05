package code.chapter_array_and_linkedlist;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Array {
    /* 随机访问数组元素 */
    static int randomAccess(int[] nums) {
        // 在区间 [0, nums.length) 中随机抽取一个数字
        int randomIndex = ThreadLocalRandom.current().nextInt(0, nums.length);
        // 获取并返回随机元素
        int randomNum = nums[randomIndex];
        return randomNum;
    }

      /* 数组扩容 */
    static int[] extend(int[] nums, int enlarge){
        // 初始化一个扩展长度后的数组
        int[] res = new int[nums.length + enlarge];
        // 将原数组中的所有元素复制到新数组
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        // 返回扩展后的新数组
        return res;
    }


    public static void main(String[] args) {
        /* 初始化数组 */
        int[] arr = new int[5];
        System.out.println("数组 arr =" + Arrays.toString(arr));
        int[] nums = new int[]{1, 3, 2, 5, 4};
        System.out.println("数组 nums =" + Arrays.toString(nums));

        /* 随机访问 */
        int randomNum = randomAccess(nums);
        System.out.println("在nums中获取随机元素:" + randomNum);

        /* 数组扩容 */
        nums = extend(nums, 3);
        System.out.println("将数组长度扩展至8,得到nums = " + Arrays.toString(nums));

        /* 插入元素 */
        


    }
   
}
