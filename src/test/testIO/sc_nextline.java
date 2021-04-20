package test.testIO;

import java.util.Arrays;
import java.util.Scanner;
/**
 * nextLine（）方法返回的是Enter键之前的所有字符,
 * 为了保证之前输入的单个数不被包括进去，所以要在使用前用另一个nextLine先将其之前的输入过滤掉
 * */
public class sc_nextline {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++){
            int[] test = new int[m];
            String[] strs = in.nextLine().split(" ");
            for (int j = 0; j < m; j++){
                test[j] = Integer.parseInt(strs[j]);
            }
            System.out.println(Arrays.toString(test));
        }
    }
}
