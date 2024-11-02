package data_structure_algorithm.leetcode;

import java.util.TreeMap;

public class _220containsNearbyAlmostDuplicate {

    public static class Solution0 {
        public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
            //思路：index不能大于固定值，这个具有单向性，可以用滑动窗口来搜索满足条件的窗口
            //然后，在窗口内，通过数据结构TreeMap来存储每个元素，计算当前元素的上下相邻元素是否满足第二个条件
            int left = 0, right = 0, n=nums.length;
            TreeMap<Integer, Integer> num2count = new TreeMap<>();
            while(right<n){
                int nr = nums[right++];
                //判断当前窗口内是否满足条件
                //判断当前值高的最小元素是否满足条件
                Integer maxLt = num2count.ceilingKey(nr);
                if(maxLt != null && maxLt - nr <=valueDiff){
                    return true;
                }
                //判断当前值低的最大元素是否满足条件
                Integer minGt = num2count.floorKey(nr);
                if(minGt != null && nr - minGt <=valueDiff){
                    return true;
                }
                num2count.put(nr, num2count.getOrDefault(nr, 0)+1);
                while(right-left > indexDiff){
                    int nl = nums[left++];
                    num2count.put(nl, num2count.get(nl)-1);
                    if(num2count.get(nl)==0){
                        num2count.remove(nl);
                    }
                }

            }
            return false;

        }
    }

    public static class Solution1 {

        /**
         滑动窗口 + TreeMap
         思路：维护窗口大小不超过indexDiff，用TreeMap记录窗口内的数字及其出现次数，
         每遍历到一个数时，从窗口内找最大的小于该数的数和最小的大于该数的数，进行比较

         时间复杂度：O(NlogK)
         空间复杂度：O(K)
         */
        public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
            int n = nums.length, left = 0, right = 0;
            TreeMap<Integer, Integer> num2Count = new TreeMap<>();
            while (right < n) {
                int nr = nums[right++];
                Integer maxLt = num2Count.floorKey(nr);
                if (maxLt != null && (long) nr - (long) maxLt <= valueDiff) {
                    return true;
                }
                Integer minGt = num2Count.ceilingKey(nr);
                if (minGt != null && (long) minGt - (long) nr <= valueDiff) {
                    return true;
                }

                num2Count.put(nr, num2Count.getOrDefault(nr, 0) + 1);
                if (right - left > indexDiff) {
                    int nl = nums[left++];
                    num2Count.put(nl, num2Count.get(nl) - 1);
                    if (num2Count.get(nl) == 0) {
                        num2Count.remove(nl);
                    }
                }
            }
            return false;
        }

    }

}
