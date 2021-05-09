package java.Thought.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 题目：数组中的数组成员代表了一些区间，去掉最少的重复区间，剩余区间无重叠，输出删除的区间数量。
 * 输入: [ [1,2], [2,3], [3,4], [1,3] ]
 * 输出: 1
 * 解释: 移除 [1,3] 后，剩下的区间没有重叠。
 *
 * 关键词是最少删除，第一反应是找出所有删除可能然后对比选最小，那么数量太多，因为删除n-1个也能保证无重复区间，
 * 所以我们要找的，是最多不重叠区间数量
 * 思路：通过遍历所有区间进行选择，首先对所有区间的右边界值进行排序，之后遍历，每次选择的条件是
 * 1.覆写sort算法，对比所有区间的右边界值
 * 2.遍历所有区间，对比每一项左区间值和前一项右区间值的大小，从第二个区间开始。
 * */


public class Non_overlapping {
    public int eraseOverlapIntervals(int[][] intervals){
        if (intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] < o2[1] ? -1:(o1 == o2 ? 0:1);
            }
        });
        int count = 1;
        int lastEnd = intervals[0][1];
        for (int i = 1 ; i < intervals.length ; i++){
            if (intervals[i][0]<lastEnd){
                continue;
            }
            lastEnd = intervals[i][1];
            count++;
        }
        return intervals.length-count;
    }


}
