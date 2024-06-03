package data_structure_algorithm.leetcode;

public class _209minSubArrayLen {
    class Solution0 {
        public int minSubArrayLen(int target, int[] nums) {
            //单向性的题都可以用滑动窗口，所谓单向性：就是窗口长度 和 窗口条件的目标是单调相关的：本题中：窗口长度越大，target越大，长度越小，target越小
            //滑动窗口就是利用了这种单向性特性，来调节左右指针的。

            int n = nums.length, left=0, right=0, minLength=Integer.MAX_VALUE, sum=0;
            while(right<n){
                sum += nums[right++];
                //挪左指针
                while(sum>=target){
                    minLength = Math.min(minLength,right-left);
                    sum -=nums[left++];//注意left移动在取值min之后, 因为移动left之后不一定满足条件，所有要先取min再挪。
                }

            }
            return minLength==Integer.MAX_VALUE?0:minLength;
        }
    }

    public static class Solution1 {

        /**
         滑动窗口
         时间复杂度：O(N)
         空间复杂度：O(1)
         */
        public int minSubArrayLen(int target, int[] nums) {
            int n = nums.length, left = 0, right = 0, sum = 0, minLen = Integer.MAX_VALUE;
            while (right < n) {
                sum += nums[right++];
                while (sum >= target) {
                    minLen = Math.min(minLen, right - left);
                    sum -= nums[left++];
                }
            }
            return minLen == Integer.MAX_VALUE ? 0 : minLen;
        }

    }

}
