package com.JianZhiOffer.Medium;
/**
 * 一句回忆：双重数组，左下开始二分思路
 *
 * [
 *   [1,2,8,9],
 *   [2,4,9,12],
 *   [4,7,10,13],
 *   [6,8,11,15]
 * ]
 * 给定 target = 7，返回 true。
 *
 * 给定 target = 3，返回 false。
 * */
//用二分查找思路完成二维有序数据遍历，注意是有序
public class 遍历矩阵查找给定元素 {
    public boolean Find(int target, int [][] array) {
        if (array.length==0)return false;
        if (array[0].length==0)return false;
        int row = array.length-1;
        int col = 0;
        while (row>=0 && col<array[0].length){
            if (array[row][col]>target){
                row--;
            }else if (array[row][col]<target){
                col++;
            }else {
                return true;
            }
        }
        return false;
    }
}
