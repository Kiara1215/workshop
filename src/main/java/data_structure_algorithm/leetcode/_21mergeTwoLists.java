package data_structure_algorithm.leetcode;

import data_structure_algorithm.domain.ListNode;

public class _21mergeTwoLists {

    public static class Solution1 {


        /**
         双指针（类似于归并排序）
         时间复杂度：O(N)
         空间复杂度：O(1)
         */
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode();
            ListNode p = dummy;
            ListNode p1 = list1;
            ListNode p2 = list2;

            while (p1 != null && p2 != null) {
                if (p1.val < p2.val) {
                    p.next = p1;
                    p1 = p1.next;
                    p = p.next;
                } else {
                    p.next = p2;
                    p2 = p2.next;
                    p = p.next;
                }
            }
            //只剩一个了，直接链接到p后面就行了
            if(p1 == null){
                p.next = p2;
            }else{
                p.next = p1;
            }

//            while (p1 != null) {
//                p.next = p1;
//                p1 = p1.next;
//                p = p.next;
//            }
//            while (p2 != null) {
//                p.next = p2;
//                p2 = p2.next;
//                p = p.next;
//            }
            return dummy.next;
        }

    }

}
