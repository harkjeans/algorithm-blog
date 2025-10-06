/**
 * File: PrintUtil.java
 * Created Time: 2025-10-06
 * Author: harkjeans (chengqi172@gmail.com)
 */

package code.utils;

import java.util.ArrayList;
import java.util.List;

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

}