package com.java.Stack_Queue; /**
 * 题目描述：输出一个数组，对应每个T数组中元素的最近的比他大的元素与他的距离：
 * Input: [73, 74, 75, 71, 69, 72, 76, 73]
 * Output: [1, 1, 4, 2, 1, 1, 0, 0]
 *
 * 关键思路：用栈存下标
 *
 * 顺序：1 循环入栈下标；2 内部循环，遇大则出栈，再大再出
 * */

import java.util.Stack;

public class nearest_maximum {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] res = new int[n];//默认值为0
        Stack<Integer> index = new Stack<>();
        //由于是要按照下标计算结果，因此需要用fori
        for (int i = 0 ; i<n ; i++){
            while (!index.isEmpty() && T[i]>T[index.peek()]){
                int nearestSmallIndex = index.pop();
                res[nearestSmallIndex] = i - nearestSmallIndex;
            }
            index.push(i);
        }
        return res;
    }
}
