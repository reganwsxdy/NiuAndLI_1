package com.java.hash;
/**
 * 题目描述：给定一个数组，返回其最长的子列，该子列要满足为和谐数列
 * 和谐数列是一个内部元素最大值-最小值=1的数列
 * Input: [1,3,2,2,5,2,3,7]
 * Output: 5
 * 解释：3,2,2,2,3是最长和谐数列，长度为5
 *
 * 思路：假定每一个元素在和谐数列中都是最小值，实际就是找比他+1的数是否存在于数列中，然后找出最长的子列
 * */
import java.util.HashMap;
import java.util.Map;

public class Longest_Harmonious_Subsequence {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for (int num : nums){
            hashmap.put(num , hashmap.getOrDefault(num , 0)+1);
        }
        int longest = 0;
        for (int key : hashmap.keySet()){
            if (hashmap.containsKey(key+1)){
                longest = Math.max(longest , hashmap.get(key)+hashmap.get(key+1));
            }
        }
        return longest;
    }
}
