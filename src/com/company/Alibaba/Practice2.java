package com.company.Alibaba;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 1; i<=n; i++){
            a[i-1] = i;
        }
        for (int i = 0; i<k; i++){
            int fir = sc.nextInt();
            int sec = sc.nextInt();
            swap(a, fir-1, sec-1);
        }
        System.out.println(Arrays.toString(a));
    }

    public static void swap(int[] a,int i, int j){
        while (i<=j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}
