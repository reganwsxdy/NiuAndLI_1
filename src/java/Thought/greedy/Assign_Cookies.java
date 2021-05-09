package java.Thought.greedy;

/**
 * 分糖问题，对应编号的小孩只满足大于等于他编号的糖，每人最多一颗，怎么分可以让最多小孩满足,返回最多可以满足小孩的数量
 * Input: grid[1,3], size[1,2,4]
 * Output: 2
 * */

import java.util.Arrays;

public class Assign_Cookies {
    public int findContentChildren(int[] g, int[] s){
        if (g == null && s == null) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0 , sj = 0;
        while (gi<=g.length && sj<=s.length){
            if (g[gi]<=s[sj]){
                gi++;
            }
            sj++;
        }
        return gi;
    }
}
