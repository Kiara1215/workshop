package data_structure_algorithm.leetcode;

public class _713numSubarrayProductLessThanK {

    public static class Solution1 {

        /**
         滑动窗口
         时间复杂度：O(N)
         空间复杂度：O(1)
         */
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            int n = nums.length, left = 0, right = 0, product = 1, count = 0;
            while (right < n) {
                product *= nums[right++];
                while (product >= k && left < right) { //这里right是在窗口外的，所以是left<right
                    product /= nums[left++];
                }
                //当前窗口中所有以 right 结尾的子数组都满足条件,所以把right-left直接加到count上
                count += right - left;
            }
            return count;
        }

    }

}
