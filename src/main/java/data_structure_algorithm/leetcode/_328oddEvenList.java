package data_structure_algorithm.leetcode;

import data_structure_algorithm.domain.ListNode;

public class _328oddEvenList {

    public static class Solution1 {

        /**
         先拆分再合并
         时间复杂度：O(N)
         空间复杂度：O(1)
         思路：先按奇偶拆分成两个链表，然后再连接起来
         */
        public ListNode oddEvenList(ListNode head) {
            ListNode odd = new ListNode(), even = new ListNode();
            //两个链表的dummy 节点
            ListNode p = head, p1 = odd, p2 = even;
            //一次取两个节点
            while (p != null && p.next != null) {
                p1.next = p;
                p1 = p1.next;
                p2.next = p.next;
                p2 = p2.next;
                p = p.next.next;
            }
            //如果剩余一个节点，肯定是奇数节点
            if (p != null) {
                p1.next = p;
                p1 = p1.next;
            }
            //断开并连接起来
            p2.next = null;
            p1.next = even.next;
            return odd.next;
        }

    }

}
