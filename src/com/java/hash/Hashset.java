package com.java.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 判断字符串中最长的-无重复项的子串-的长度
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 窗口算法判断，首先要用到哈希集合存放每一次判断的子串，然后用contain方法确认其中是否有已经出现过的字符
 * 注：字符串默认是由带下标的字符组成的集合
 * 注2：子串的初始情况都是没有成员的，因此右下标为-1
 * */

public class Hashset {
    public int lengthOfLongestSubstring(String s){
        Set<Character> sub = new HashSet<>();
        int n = s.length();
        int rk = -1, len = 0;
        for (int i = 0; i < n; i++) {
            //刚开始直接向后移
            if (i != 0){
                sub.remove(s.charAt(i-1));
            }
            //查找子串中是否有已存在的值，实际上只需要确定是否有新加入的值在子串中已经存在
            //rk初始值为-1，因此初始判断条件用rk+1
            while(rk+1 < n && !sub.contains(s.charAt(rk+1))){
                sub.add(s.charAt(rk+1));
                rk++;
            }
            //通过以下方式不断更新len
            len = Math.max(len,sub.size());
        }
        return len;
    }
}
