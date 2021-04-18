package com.java.Thought.two_indicator;

/**
 * 题目描述：允许删除一个字符，使得一个字符串为回文
 *  关键思路：通过编写一个类似方法，用于判断删除（或者说跳过）后的字符串是否回文，运行时调用该方法，规定范围
 *
 *  注：之所以isPalindrome方法用while是因为这次的输入参数里有i,j,主方法里可以用while方法。
 * */

public class palindrome {
    public boolean validPalindrome(String s){
        for (int i = 0, j = s.length() - 1;i<=j;i++,j--){
            if (s.charAt(i)!=s.charAt(j)){
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s , int i , int j){
        while (i<j){
            if (s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
