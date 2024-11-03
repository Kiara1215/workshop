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

        //双指针
        public ListNode removeNthFromEnd0(ListNode head, int n) {
            // 虚拟头结点
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            // 删除倒数第 n 个，要先找倒数第 n + 1 个节点，从dummy开始算起
            ListNode x = findFromEnd(dummy, n + 1);
            // 删掉倒数第 n 个节点
            x.next = x.next.next;
            return dummy.next;
        }


        ListNode findFromEnd(ListNode head, int k) {
            ListNode p1 = head;
            // p1 先走 k 步
            for (int i = 0; i < k; i++) {
                p1 = p1.next;
            }
            ListNode p2 = head;
            // p1 和 p2 同时走 n - k 步
            while (p1 != null) {
                p2 = p2.next;
                p1 = p1.next;
            }
            // p2 现在指向第 n - k + 1 个节点，即倒数第 k 个节点
            return p2;
        }

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
