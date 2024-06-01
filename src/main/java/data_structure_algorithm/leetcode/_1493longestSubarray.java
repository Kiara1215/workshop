package data_structure_algorithm.leetcode;

public class _1493longestSubarray {

    public static class Solution0 {

        /**
         思路：判断滑动窗口里0的个数，来调整左右指针。记录长度的时候，需要减掉1个元素
         */
        public int longestSubarray(int[] nums) {
            int n = nums.length, left = 0, right = 0, maxLen = 0, count0 = 0;
            while(right < n){
                if(nums[right++] == 0) count0++;
                while(count0>1){
                    if(nums[left++]==0) count0--;
                }
                maxLen = Math.max(maxLen, right-left-1);
            }
            return maxLen;
        }

    }

    public static class Solution1 {

        /**
         滑动窗口
         时间复杂度：O(N)
         空间复杂度：O(N)
         */
        public int longestSubarray(int[] nums) {
            int n = nums.length, left = 0, right = 0, remain = 1, maxLen = 0;
            while (right < n) {
                int zeroIndex = right;
                while (right < n && (nums[right] == 1 || remain > 0)) {
                    if (nums[right] != 1) {
                        remain--;
                        zeroIndex = right;
                    }
                    right++;
                }
                maxLen = Math.max(maxLen, right - left - 1);
                left = zeroIndex + 1;
                remain++;
            }
            return maxLen;
        }

    }

}
