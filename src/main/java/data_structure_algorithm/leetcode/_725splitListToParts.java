package data_structure_algorithm.leetcode;

import data_structure_algorithm.domain.ListNode;

public class _725splitListToParts {

    public static class Solution1 {

        /**
         先计算链表长度，然后分隔
         时间复杂度：O(N)
         空间复杂度：O(1)
         */
        public ListNode[] splitListToParts(ListNode head, int k) {
            //先计算出每一份里有多少node，余数是多少就代表前面有几份里的node是多一个的
            //从前往后按个数先分多一个的组，然后分正好的组，记得断开每组

            // 计算链表长度
            ListNode p = head;
            int n = 0;
            while (p != null) {
                n++;
                p = p.next;
            }

            // 分隔成k部分，每部分n/k个元素，前n%k个部分多一个元素
            ListNode[] res = new ListNode[k];
            int subLen = n / k;
            int extraOne = n % k;
            p = head;

            //先组装多一个的组：
            for (int i = 0; i < extraOne; i++) {
                ListNode subHead = p, prev = null;//前驱节点是为了断开用
                int count = 0;
                while (count < subLen + 1) {
                    prev = p;
                    p = p.next;
                    count++;
                }
                if (prev != null) prev.next = null;//断开
                res[i] = subHead;
            }
            //再组装长度刚好的组：
            for (int i = extraOne; i < k; i++) {
                ListNode subHead = p, prev = null;
                int count = 0;
                while (count < subLen) {
                    prev = p;
                    p = p.next;
                    count++;
                }
                if (prev != null) prev.next = null;
                res[i] = subHead;
            }
            return res;
        }

    }

}
