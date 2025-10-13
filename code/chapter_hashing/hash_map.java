/**
 * File: hash_map.java
 * Created Time: 2025-10-12
 * Author: harkjeans (chengqi172@gmail.com)
 */

package code.chapter_hashing;

import java.util.*;

import code.utils.PrintUtil;

public class hash_map {
    public static void main(String[] args) {
        /* 初始化哈希表 */
        Map<Integer, String> map = new HashMap<>();

        /* 添加操作 */
        // 在哈希表中添加键值对(key, value)
        map.put(100, "Hark");
        map.put(101, "Tom");
        map.put(102, "Jerry");
        map.put(103, "James");
        map.put(104, "Curry");
        System.out.println("添加完成后,哈希表为\nKey->Value");
        PrintUtil.printHashMap(map);

        /* 查询操作 */
        // 向哈希表中输入键 key, 得到值 value
        String name = map.get(103);
        System.out.println("输入学号 103, 查询得到姓名为: " + name);

        /* 删除操作 */
        // 在哈希表中删除键值对 (key, value)
        map.remove(101);
        System.out.println("删除 101 后, 哈希表为\nKey->Value");
        PrintUtil.printHashMap(map);

        /* 遍历哈希表 */
        System.out.println("遍历键值对 Key->Value");
        for (Map.Entry<Integer, String> kv : map.entrySet()) {
            System.out.println(kv.getKey() + "->" + kv.getValue());
        }
        System.out.println("单独遍历键 Key");
        for (int key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("单独遍历 Value");
        for (String val : map.values()) {
            System.out.println(val);
        }
    }
}
