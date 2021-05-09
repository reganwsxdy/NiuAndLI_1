package com.company.bilibili;
/**
 * 最少硬币数问题：
 * 有面额为1,3,5的硬币，且每个硬币数量不限，请问面额为N的最少银币数
 *
 * 动规思路：
 * 1 设置一个f(x)，x为面额，f(x)为面额为x的最小硬币数量，则f(x)=min(f(x-1),f(x-3),f(x-5))+1
 * 2 关键步骤是一个双重循环，
 * */
import java.util.Scanner;

public class MinCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] trans = sc.nextLine().split(" ");
        int[] array = new int[trans.length];
        for (int i = 0; i < trans.length; i++){
            array[i] = Integer.parseInt(trans[i]);
        }
        System.out.println(getMinCoin(array, N));
    }
    public static int getMinCoin(int[] array, int N){
        int length = array.length;
        if(array == null || length == 0 || N <= 0){
            return 0;
        }

        int[] dp = new int[N+1];
        for (int i = 0; i < N+1; i++){
            dp[i] = 0;
        }

        for (int i = 1; i < N+1; i++){
            for (int k : array) {
                if (i - k >= 0) {
                    dp[i] = dp[i - k] + 1;
                }
            }
        }

        return dp[N];

    }
}
