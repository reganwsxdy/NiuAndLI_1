package com.java.Thought.SlideWindow;
/**
 * 题目描述：t串为字典，找到s串中包含t串字符的子串，并返回最短的子串
 * 思路：双指针滑窗，考虑到t串中的字符可能重复出现，如AABC，因此用两个map来记录，t串对应tt，tt压入之后作为对比项，而s对应ss
 * 外层while判断是否在tt中包含某个key，如果包含则压入ss，内层while在ss和tt相同的时候（用count计数，当且仅当get(key)相同时count++），
 * 才开始运行，如果左指针元素containsKey为true时，count--，left++，且要把ss中对应的get(key)-1，
 *
 * 注：该题思路暂时正确，但是内容暂时不正确，需要后续进行调整
 * */
import java.util.HashMap;
import java.util.Map;

public class minWindow {

    public static String minWindow(String s, String t){
        Map<Character, Integer> ss = new HashMap<>();
        Map<Character, Integer> tt = new HashMap<>();
        int left = 0, right = 0;
        int start = 0;
        int len = Integer.MAX_VALUE;
        int count = 0;
        for(char a : t.toCharArray()){
            tt.put(a, tt.getOrDefault(a,0)+1);
        }
        while(right<s.length()){
            char c1 = s.charAt(right);
            if (tt.containsKey(c1)){
                ss.put(c1, ss.getOrDefault(c1,0)+1);
                if (ss.get(c1) == tt.get(c1)){
                    count++;
                }
            }
            right++;

            while (count == tt.size()){
                len = Math.min(len, right-left);
                start = left;
                char c2 = s.charAt(left);
                if (tt.containsKey(c2)){
                    ss.put(c2, ss.get(c2)-1);
                    if (ss.get(c2)<tt.get(c2)){
                        count--;
                    }
                }
                left++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start+len);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));

    }
}
