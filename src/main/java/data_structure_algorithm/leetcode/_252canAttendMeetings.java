package data_structure_algorithm.leetcode;

import java.util.Collections;
import java.util.List;

public class _252canAttendMeetings {

    /**
     * Leetcode会员题，Lintcode题目链接：https://www.lintcode.com/problem/920/
     */

    /**
     * Definition of Interval
     */
    public class Interval {
        int start, end;
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }



    public static class Solution1 {

        public boolean canAttendMeetings(List<Interval> intervals) {
            if (intervals == null || intervals.size() < 2) {
                return true;
            }

            // 按照开始时间排序
            Collections.sort(intervals, (i1, i2) -> (i1.start - i2.start));

            // 判断当前区间的开始时间是否小于前一个区间的结束时间
            for (int i = 1; i < intervals.size(); i++) {
                if (intervals.get(i).start < intervals.get(i-1).end) {
                    return false;
                }
            }
            return true;
        }

    }



}