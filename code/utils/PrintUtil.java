/**
 * File: PrintUtil.java
 * Created Time: 2025-10-06
 * Author: harkjeans (chengqi172@gmail.com)
 */

package code.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PrintUtil {
    /* 打印链表 */
    public static void printLinkedList(ListNode head) {
        List<String> list = new ArrayList<>();
        while (head != null) {
            list.add(String.valueOf(head.val));
            head = head.next;
        }
        System.out.println(String.join(" -> ", list));
    }

    /* 打印哈希表 */
    public static <K, V> void printHashMap(Map<K, V> map) {
        for (Map.Entry<K, V> kv : map.entrySet()) {
            System.out.println(kv.getKey() + "->" + kv.getValue());
        }
    }

}