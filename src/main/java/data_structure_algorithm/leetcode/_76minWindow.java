package data_structure_algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _76minWindow {

    class Solution0 {
        public String minWindow(String s, String t) {
            //最小滑窗：

            //先定义初始变量
            int start =0,end=0,left=0,minLength=Integer.MAX_VALUE,n=s.length(),match=0;
            //定义集合，由于是需要计算元素以及它的数量，所以用哈希表map
            Map<Character,Integer> needs= new HashMap<>();
            Map<Character,Integer> counts= new HashMap<>();

            //初始化目标t的哈希表
            for(char c:t.toCharArray()){
                needs.put(c,needs.getOrDefault(c,0)+1);
            }
            //开始循环右指针
            while(end<n){
                //读取每一个end元素，更新集合，目的是计算出是否match满足题目条件，进而更新minLength,移动左指针
                char c1 = s.charAt(end++);
                if(needs.containsKey(c1)){
                    counts.put(c1,counts.getOrDefault(c1,0)+1);
                    if(counts.get(c1).equals(needs.get(c1))){
                        match++;
                    }
                }
                //看是否满足条件，记录minLength 和字符串起始位置
                while(match == needs.size()){
                    if(end-start<minLength){
                        minLength=end-start;
                        left=start;
                    }
                    //更新集合更新match，往前挪左指针，看下还能不能满足条件
                    char c2=s.charAt(start);
                    if(counts.containsKey(c2)){
                        if(counts.get(c2).equals(needs.get(c2))){
                            match--;
                        }
                        counts.put(c2, counts.get(c2)-1);
                    }
                    start++; //每一次判断完都要往前挪左指针，因为挪之前已经记录下来了。
                }

            }
            return minLength==Integer.MAX_VALUE?"":s.substring(left,left+minLength);


        }
    }

    public static class Solution1 {

        /**
         滑动窗口
         时间复杂度：O(N)
         空间复杂度：O(N)
         */
        public String minWindow(String s, String t) {
            Map<Character, Integer> needs = new HashMap<>();
            Map<Character, Integer> count = new HashMap<>();
            for (char c : t.toCharArray()) {
                needs.put(c, needs.getOrDefault(c, 0) + 1);
            }
            int start = 0, end = 0, match = 0, minLen = Integer.MAX_VALUE, left = 0;
            while (end < s.length()) {
                char c1 = s.charAt(end);
                if (needs.containsKey(c1)) {
                    count.put(c1, count.getOrDefault(c1, 0) + 1);
                    // 注意这里不能用"=="比较，因为Integer采用享元模式(-128, 127)之间的值会共用同一个，而"=="比较的是地址
                    if (count.get(c1).equals(needs.get(c1))) {
                        match++;
                    }
                }
                end++;

                while (match == needs.size()) {
                    if (end - start < minLen) {
                        minLen = end - start;
                        left = start;
                    }
                    char c2 = s.charAt(start);
                    if (needs.containsKey(c2)) {
                        if (count.get(c2).equals(needs.get(c2))) {
                            match--;
                        }
                        count.put(c2, count.getOrDefault(c2, 0) - 1);
                    }
                    start++;
                }
            }
            return minLen == Integer.MAX_VALUE ? "" : s.substring(left, left + minLen);
        }

    }

}
