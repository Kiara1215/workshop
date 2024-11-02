package data_structure_algorithm.leetcode;

import data_structure_algorithm.domain.ListNode;

import java.util.HashSet;
import java.util.Set;

public class _141hasCycle {

    /**
     * Definition for singly-linked list.
     */
    public static class Solution1 {

        /**
         哈希表：用哈希表记录走过的节点
         时间复杂度：O(N)
         空间复杂度：O(N)
         */
        public boolean hasCycle(ListNode head) {
            Set<ListNode> set = new HashSet<>();
            while (head != null) {
                set.add(head);
                head = head.next;
                if (set.contains(head)) {
                    return true;
                }
            }
            return false;
        }

    }



    public static class Solution2 {

        /**
         //快慢指针的写法：慢指针走一步，快指针走两步，如果两个指针早晚相遇了就代表有环，如果没有环，一定会遍历到null
         // 备注：其实快慢指针速度相差多少倍都可以，入环时机早晚无所谓，只要有环，这俩早晚会相遇，这就是所谓的宿命
         //时间：O(N)
         //空间：O(1)
         **/
         public boolean hasCycle(ListNode head) {
             if (null == head) return false;

             ListNode fast = head;
             ListNode slow = head;
             while(null != fast && null != fast.next) {
                 slow = slow.next;
                 fast = fast.next.next;
                 if (fast == slow) return true;
             }
             return false;
         }

    }



}
