/**
 * File: array.java
 * Created Time: 2025-10-06
 * Author: harkjeans (chengqi172@gmail.com)
 */

package code.chapter_array_and_linkedlist;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class array {
    /* 随机访问数组元素 */
    static int randomAccess(int[] nums) {
        // 在区间 [0, nums.length) 中随机抽取一个数字
        int randomIndex = ThreadLocalRandom.current().nextInt(0, nums.length);
        // 获取并返回随机元素
        int randomNum = nums[randomIndex];
        return randomNum;
    }

    /* 数组扩容 */
    static int[] extend(int[] nums, int enlarge) {
        // 初始化一个扩展长度后的数组
        int[] res = new int[nums.length + enlarge];
        // 将原数组中的所有元素复制到新数组
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        // 返回扩展后的新数组
        return res;
    }

    /* 在数组索引 index 处插入元素 num */
    static void insert(int[] nums, int num, int index){
        // 把索引 index 以及之后的所有元素向后移动一位
        for (int i = nums.length - 1; i > index; i--) {
            nums[i] = nums[i - 1];
        }
        // 将 num 赋给 index 处的元素
        nums[index] = num;
    }
    
    /* 删除索引 index 处的元素 */
    static void remove(int[] nums, int index) {
        // 把索引 index 之后的所有元素向前移动一位
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }       
       
    /* 遍历数组 */    
    static void traverse(int[] nums) {
        // 通过索引遍历数组
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        // 直接遍历数组元素
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
    /* 在数组中查找指定元素 */
    static int find(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
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
        insert(nums, 6, 3);
        System.out.println("在索引3处插入数字6,得到nums = " + Arrays.toString(nums));

        /* 删除元素 */
        remove(nums, 2);
        System.out.println("删除索引2处的元素, 得到 nums = " + Arrays.toString(nums));

        /* 遍历数组 */
        traverse(nums);

        /* 查找元素 */
        int index = find(nums, 3);
        System.out.println("在nums中查找元素 3 得到对应索引 = " + index);
    }
   
}
