package data_structure_algorithm.leetcode;

import data_structure_algorithm.domain.ListNode;

public class _237deleteNode {

    public static class Solution1 {

        /**
         将next节点的val复制到该节点，然后删除next节点
         时间复杂度：O(1)
         空间复杂度：O(1)
         //完全copy后一个节点的属性，来覆盖掉当前node节点，即完成了当前节点的删除
         */
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }

    }

}
