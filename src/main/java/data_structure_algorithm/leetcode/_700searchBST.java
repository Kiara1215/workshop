package data_structure_algorithm.leetcode;

import data_structure_algorithm.domain.TreeNode;

public class _700searchBST {

    public static class Solution1 {

        /**
         递归
         时间复杂度：O(N)
         空间复杂度：O(N)
         */
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null) return null;
            if (val == root.val) return root;
            else if (val < root.val) return searchBST(root.left, val);
            else return searchBST(root.right, val);
        }

    }

    //迭代2:通用的搜索模版：
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode cur = root;
        while(cur != null && cur.val !=val){
            if(cur.val>val) cur= cur.left;
            else cur=cur.right;
        }
        return cur;
    }


    public static class Solution2 {

        /**
         迭代
         时间复杂度：O(N)
         空间复杂度：O(1)
         */
         public TreeNode searchBST(TreeNode root, int val) {
             while (root != null) {
                 if (val == root.val) return root;
                 else if (val < root.val) root = root.left;
                 else root = root.right;
             }
             return null;
         }

    }

}
