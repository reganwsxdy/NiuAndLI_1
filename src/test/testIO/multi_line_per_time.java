package test.testIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 已知行数和形式的输入是可以通过在循环中多次读取得到的
 * 输入描述:
 * 第一行输入两个整数n和k
 * 第二行输入一个整数数组
 *
 * 输出描述:
 * 输出一个从小到大排序的整数数组
 * */
public class multi_line_per_time {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=" ";
        while((str=br.readLine())!=null){
            String[] sa = str.split(" ");
            int n = Integer.parseInt(sa[0]);
            int k = Integer.parseInt(sa[1]);
            String[] num_st = br.readLine().split(" ");
            int[] arr = new int[num_st.length];
            for(int i=0;i<arr.length;i++){
                arr[i]=Integer.parseInt(num_st[i]);
            }
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<k;i++){
                sb.append(arr[i]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
