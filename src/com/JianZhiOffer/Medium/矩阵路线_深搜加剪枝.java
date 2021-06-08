package com.JianZhiOffer.Medium;

import java.util.Objects;

/**
 * 思路：假设从i，j开始遍历（即假设board[i][j]已经符合第一个元素相同），若要继续前进，需要满足：1，前后左右有元素，2，该元素未被访问过，3，若有元素，需要匹配第二个字符，
 * 如此如果最终一直为true
 *
 * 深搜+剪枝，深搜写一个递归函数，其中每一步进行：一，访问元素的标记，二，判断前后左右的相邻元素是否符合要求，三，放回元素标记
 *
 * 总之：只关注这一步和下一步的操作即可
 * */
public class 矩阵路线_深搜加剪枝 {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char[] words = word.toCharArray();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (myExist(board, words, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }
//写一个从i，j开始往后判断的DFS，主函数用双重循环调用
    public boolean myExist(char[][] board, char[] words, int i, int j, int k){
        //先判断：
        if (i< 0 || i>board.length-1 || j<0 || j>board[0].length-1 || !Objects.equals(board[i][j], words[k]))return false;
        if (k == words.length-1)return true;
        char temp = board[i][j];
        board[i][j] = '/';
        boolean res = myExist(board, words, i+1, j, k+1) || myExist(board, words, i, j+1, k+1) || myExist(board, words, i-1, j, k+1) || myExist(board, words, i, j-1, k+1);
        board[i][j] = temp;
        return res;
    }
}
