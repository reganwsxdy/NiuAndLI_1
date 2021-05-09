package com.company.meituan;
/**
 * 整数反转
 * 输入：123，输出：321
 * */
import java.io.IOException;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int x = sc.nextInt();
            int res = 0;
            while (x != 0){
                if ((res*10)/10 != res){
                    res = 0;
                    break;
                }
                res = res*10 + x%10;
                x /= 10;
            }
            System.out.println(res);
        }

    }
}
