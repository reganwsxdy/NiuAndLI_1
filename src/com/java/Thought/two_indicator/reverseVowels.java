package com.java.Thought.two_indicator; /**
 * 题目：交换字符串中的元音字符
 * 字符数组没有交换方法，因此创建一个新字符数组再输出得到方法比较好
 *
 * 输入："hello"
 * 输出："holle"
 * */

import java.util.Arrays;
import java.util.HashSet;

public class reverseVowels {
    private final static HashSet<Character> vow = new HashSet<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U')
    );

    public static String reverseVowels(String s){
        if (s == null)return null;
        int i = 0, j = s.length()-1;
        char[] res = new char[s.length()];
        while (i <= j ){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!vow.contains(ci)){
                res[i++] = ci;
            }else if (!vow.contains(cj)){
                res[j--] = cj;
            }else {
                res[i++] = cj;
                res[j--] = ci;
            }
        }
        return new String(res);
    }

    public static void main(String[] args) {
        String a = "hello";
        System.out.println(reverseVowels(a));
    }
}
