package com.company.meituan;

/**
 * 输入一个只有0和1的字符串，假设一次只能删除连续三个其中数字，可以删除多次。返回删除过后1和0的数量最大的差值。
 *
 * 思路：找出最大值-》确定初始差值res-》根据1多还是0多确定删除策略-》遍历数组，满足策略条件且题目条件的进行跳指针（+3）并更新res-》考虑特殊情况
 * 确定策略时要注意，满足策略条件的固定窗口并不需要满足某种顺序，由于是固定窗口且长度较短，因此可满足的条件情况较少，可以分类讨论。
 * */
public class removeN {
    public static int MaxRes(int[] nums, int n){
        //l为移动指针，m为原数组中0的个数。
        int l = 0, m = 0;
        //count为计算固定窗口中所有值的和
        int res,count;
        //统计0的数量
        for (int i = 0; i < n; i++)if (nums[i]==0)m++;
        //初始0多的情况
        if ((2*m-n)>0){
            res = 2*m-n;
            while ((l+2)<n){
                count = nums[l]+nums[l+1]+nums[l+2];
                if (count==2){
                    if ((l+3)<n && (nums[l+1]+nums[l+2]+nums[l+3])==3){
                        l++;
                     }else {
                        res+=1;
                        l+=3;
                    }
                }else if(count==3){
                    res+=3;
                    l+=3;
                }else {
                    l++;
                }
            }
            //否则就是初始1多的情况
        }else {
            res = n-2*m;
            while ((l+2)<n){
                count = nums[l]+nums[l+1]+nums[l+2];
                if (count==1){
                    if ((l+3)<n && (nums[l+1]+nums[l+2]+nums[l+3])==0){
                        l++;
                    }else {
                        res+=1;
                        l+=3;
                    }
                }else if(count==0){
                    res+=3;
                    l+=3;
                }else {
                    l++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,0,0,0,1};
        int n = nums.length;
        System.out.println(MaxRes(nums, n));
    }
}
