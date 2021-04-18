package com.java.Thought.two_indicator; /**
 * 题目描述：给定一个长字符串s，一个字典（字符串数组），匹配字典中的字符串是否是长串s中的子串，如果存在多个字典字符串为子串，则返回最长且字典位置最靠前的字符串
 * 难点1：判断子串方法；难点2；返回字典位最长最靠前的字符串
 *
 * Input:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * Output:
 * "apple"
 *
 * 注意：continue用于结束本次循环，直接开始下一次循环，break用于结束整个循环
 * */

import java.util.List;

public class Longest_word {
    public String findLongestWord(String s, List<String> dictionary){
        String longestWord = "";
        for (String target : dictionary){
            if (isSubstr(s,target)){
                if(longestWord.length() < target.length()){
                    longestWord = target;
                }else if (longestWord.length() == target.length()){
                    longestWord = longestWord.compareTo(target) < 0? longestWord:target;
                }
            }
        }
        return longestWord;


    }

    private boolean isSubstr(String s , String target){
        int i = 0 , j = 0;
        while (i < s.length() && j < target.length()){
            if (s.charAt(i) == target.charAt(j)){
                j++;
            }
            i++;
        }
        return j == target.length();
    }

}
