package data_structure_algorithm.leetcode;

import data_structure_algorithm.domain.ListNode;

public class _234isPalindrome {

    public static class Solution1 {

        /**
         双指针
         时间复杂度：O(N)
         空间复杂度：O(1)
         */
        public boolean isPalindrome(ListNode head) {
            //快慢指针找到中点，同时把慢指针走过的前半部分进行翻转，然后从中间向两边逐个比较
            //PS：用到的基础：链表翻转，找中点
            ListNode slow = head, fast = head, prev = null;
            //翻转链表：翻转完之后，prev和slow是断开的，slow指向链表中点，fast在链表最后或者null
            while(fast != null && fast.next != null){
                //首先 先移动fast，不要在翻转完再移动
                fast = fast.next.next;
                //然后 翻转
                ListNode next = slow.next;
                slow.next = prev;
                prev = slow;
                slow = next;

            }
            //处理特殊情况: 如果奇数个节点，中间节点不做比较，跳过
            if(fast != null){
                slow = slow.next;
            }

            //从中间到两边进行比较
            while(prev != null && slow != null){
                if(prev.val != slow.val){
                    return false;
                }
                slow = slow.next;
                prev = prev.next;
            }
            return true;
        }

    }



    public static class Solution2 {

        /**
         双指针：快慢指针找中点，然后反转前半部分，再逐一比较
         时间复杂度：O(N)
         空间复杂度：O(1)
         */
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) {
                return true;
            }

            // 快慢指针找中点
            ListNode fast = head, slow = head, prev = null;
            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next = null;

            // 反转前半部分
            prev = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }

            // 逐一比较
            if (fast != null) slow = slow.next;     // 链表节点是奇数个，跳过中间节点
            while (prev != null) {
                if (prev.val != slow.val) return false;
                prev = prev.next;
                slow = slow.next;
            }
            return true;
        }

    }

}
