package StepTwo.DongTaiGuiHua.矩阵数列;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 64.最小路径和
 * 输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
 * 输出：7
 * 解释：因为路径 1→3→1→1→1 的总和最小。
 *
 * 输入：m为行数、n为列数
 * */
public class ZuiXiaoLuJingHe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                grid[i][j] = sc.nextInt();
            }
        }
    }

    public int minPathSum(int grid[][]){
        //边界条件
        if (grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        //dp准备工作：1）加入初始几个固定值 2）根据规则循环添加其他几个值
        int row = grid.length;
        int column = grid[0].length;
        int[][] dp = new int[row][column];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < column; i++){
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for (int j = 1; j < row; j++){
            dp[j][0] = dp[j-1][0] + grid[j][0];
        }
        for (int i = 1; i < row; i++){
            for (int j = 1; j < column; j++){
                dp[i][j] = Math.min((dp[i-1][j]+grid[i][j]),(dp[i][j-1]+grid[i][j]));
            }
        }
        return dp[row-1][column-1];
    }
}
