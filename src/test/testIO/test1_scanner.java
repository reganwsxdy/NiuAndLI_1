package test.testIO;

/**
 * scanner通常使用next进行读取下一个输入，next()在遇到空格时读取结束
 * */

import java.util.Arrays;
import java.util.Scanner;

public class test1_scanner {
    public static void main(String[] args) {
        System.out.println("输入：");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] num1 = new int[m];
            int[] num2 = new int[n];
            // 换成其他数据类型也一样，其他数值类型就修改int跟nextInt就可以了，
            //String就把nextInt()换成next()
            for(int i = 0; i < m; i ++) {
                num1[i] = sc.nextInt();  // 一个一个读取
            }
            for(int i = 0; i < n; i ++) {
                num2[i] = sc.nextInt();
            }
            System.out.println("输出：");
            System.out.println(Arrays.toString(num1));
            System.out.println(Arrays.toString(num2));
        }
    }
}
