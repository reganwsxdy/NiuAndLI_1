package java.Sort;

import java.util.Arrays;

//快排主要注意一点，就是单次筛选时要随时检查左右指针是否相遇
public class quicksort {
    private static void sortColors(int[] nums,int low ,int high){
        int i = low , j = high;
        if (low<high){//如果不满足直接停止，这是一个特殊情况下的出口
            int tmp = nums[low];
            //交替遍历的行为涉及到双层循环
            while (i<j){
                while (j>i && nums[j]>tmp)j--;
                if(j>i)nums[i++] = nums[j];
                while (i<j && nums[i]<tmp)i++;
                if (i<j)nums[j--] = nums[i];
            }
            nums[i] = tmp;
            sortColors(nums,low,i-1);
            sortColors(nums,i+1,high);
        }

    }

    public static void main(String[] args) {
        int[] nums = {2,4,3,5,1,6,7};
        int low = 0 , high = nums.length-1;
        sortColors(nums,low,high);
        System.out.println(Arrays.toString(nums));
    }
}
