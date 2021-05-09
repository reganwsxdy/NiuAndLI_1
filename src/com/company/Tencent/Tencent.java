package com.company.Tencent;

import java.util.Arrays;

public class Tencent {

    public static void sortColors(int[] nums, int low, int high) {
        Arrays.sort(nums);
        int i = low, j = high;
        if (low<high){
            int mid = (nums[i]+nums[j])/2;
            int rec1 = 0, rec2 = 0;
            int res = 0;
            for (int m = 0; m < high-low+1; m++) {
                if (nums[m]>mid){
                    rec1 = m-1;
                    rec2 = m;
                    break;
                }
            }
            res+= sum(nums, low, rec1)+sum(nums, rec2, high);
            sortColors(nums, low ,rec1);
            sortColors(nums, rec2, high);
            System.out.println(res);
        }
    }

    public static int sum(int[] num, int low ,int high){
        int count = 0;
        if (low>high)return 0;
        for (int i = low; i <= high; i++) {
            count+=num[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int low = 0, high = nums.length-1;
        sortColors(nums,low,high);
    }
}

