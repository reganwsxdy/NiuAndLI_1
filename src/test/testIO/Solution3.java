package test.testIO;

import java.util.Scanner;

public class Solution3 {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++){
            int temp = sc.nextInt();
            slide(temp, k);
        }
        System.out.println(count);
    }

    private static void slide(int x, int k){
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (i<=x/2){
            if (x%i==0){
                sb.append(i);
            }
            i+=1;
        }
        sb.append(x);
        if (sb.toString().contains(String.valueOf(k))){
            count+=1;
        }
    }
}
