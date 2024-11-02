package data_structure_algorithm.leetcode;

import data_structure_algorithm.domain.ListNode;

public class _19removeNthFromEnd {

    /**
     双指针
     时间复杂度：O(N)
     空间复杂度：O(1)
     */
    class Solution0 {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0, head), pre = dummy, fast = dummy;
            //移动fast到固定的n的位置
            for(int i = 0; i < n; i++){
                fast = fast.next;
            }
            //同时移动slow fast，让slow移到要删除的前驱位置
            while(fast.next != null){
                fast = fast.next;
                pre = pre.next;
            }
            //删除节点
            pre.next = pre.next.next;
            return dummy.next;

        }
    }

    public static class Solution1 {

        /**
         双指针
         时间复杂度：O(N)
         空间复杂度：O(1)
         */
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode sentinel = new ListNode();
            sentinel.next = head;

            ListNode prev = sentinel;
            ListNode slow = head;
            ListNode fast = head;
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }

            while (fast != null) {
                fast = fast.next;
                prev = slow;
                slow = slow.next;
            }
            prev.next = slow.next;
            return sentinel.next;
        }

    }



}
