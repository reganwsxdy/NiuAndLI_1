package test.testIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cube {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str=bf.readLine())!= null){
            String[] inf = str.trim().split(" ");
            int m = Integer.parseInt(inf[0]);
            int n = Integer.parseInt(inf[1]);
            int[] a = new int[3];
            int count = 0;
            while (m<=n){
                int sum = 0;
                a[0] = m/100;
                a[1] = m/10%10;
                a[2] = m%10;
                for (int i = 0; i < 3; i++){
                    sum+= Math.pow(a[i],3);
                }
                if (m == sum){
                    count++;
                    System.out.print(m+" ");
                }
                m++;
            }
            if (count == 0){
                System.out.println("no");
            }else {
                System.out.println();
            }

        }
    }
}
