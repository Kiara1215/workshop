package data_structure_algorithm.leetcode;

public class _2765alternatingSubarray {
    class Solution0 {
        //思路：滑动窗口 这种属于一段一段的滑动窗口，每个窗口满足滑动窗口的单向性，但可以一整段的粒度的移动左右指针，而非一个个元素为粒度来移动指针。
        //类似题：
        public int alternatingSubarray(int[] nums) {
            int left = 0, right = 0, maxLen=-1, n=nums.length;
            while(right<n-1){ //要找子数组，至少需要2个元素，所以是<n-1,也是防止下面r+1越界
                //先把right移动到满足条件的起始位置
                if(nums[right+1] - nums[right] != 1) {
                    right++;
                    continue;
                }
                left = right;
                right+=2;
                //right去找到这段满足条件的区间的末尾(找到了不满足条件的第一个位置)
                while(right<n && nums[right]==nums[right-2])right++;
                maxLen = Math.max(maxLen, right-left);
                right--; //此处要回调一个，是因为需要判断right跟相邻的前一个元素是否满足条件

            }
            return maxLen;
        }
    }

    public static class Solution1 {

        /**
         滑动窗口
         时间复杂度：O(N)
         空间复杂度：O(1)
         */
        public int alternatingSubarray(int[] nums) {
            int n = nums.length, i = 0, maxLen = -1;
            while (i < n - 1) {
                // 不符合的直接跳过
                if (nums[i + 1] - nums[i] != 1) {
                    i++;
                    continue;
                }
                int start = i;  // 记录这一组开始的位置
                i += 2; // i和i+1已经满足要求，从i+2开始判断
                while (i < n && nums[i] == nums[i - 2]) i++;
                maxLen = Math.max(maxLen, i - start);
                i--;
            }
            return maxLen;
        }

    }

}
