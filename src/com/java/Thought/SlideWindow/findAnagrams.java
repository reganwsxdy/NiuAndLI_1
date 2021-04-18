package com.java.Thought.SlideWindow;
/**
 *题目：找到所有子母异位词
 * 输入:
 * s: "cbaebabacd" p: "abc"
 * 输出:
 * [0, 6]
 *  * */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findAnagrams {
    public List<Integer> findAnagrams(String s, String p){
        Map<Character, Integer> pp = new HashMap<>();
        Map<Character, Integer> ss = new HashMap<>();
        for (char a: p.toCharArray()){
            pp.put(a, pp.getOrDefault(a,0)+1);
        }
        int left = 0, right = 0;
        int count = 0;
        List<Integer> res = new ArrayList<>(s.length());
        while (right<s.length()){
            char sr = s.charAt(right);
            if (pp.containsKey(sr)){
                ss.put(sr, ss.getOrDefault(sr, 0)+1);
                if (ss.get(sr).equals(pp.get(sr))){
                    count++;
                }
            }
            right++;
            while (count == pp.size()){
                if (right - left == p.length()){
                    res.add(left);
                }//当count相等时只能说明该子串包含p的内容，不能直接添加到res中，因此需要多加一层判断
                char sl = s.charAt(left);
                if (pp.containsKey(sl)){
                    ss.put(sl, ss.get(sl)-1);
                    if (ss.get(sl)<pp.get(sl)){
                        count--;
                    }
                }
                left++;
            }
        }
        return res;
    }
}
