package java.Thought.two_indicator;

/**
 * 题目描述：合并第二个数组到第一个数组上（尾并），并使得合并后的数组有序,输出第一个数组
 * 关键：
 * 1 两个数组均为有序数组，因此可以从后往前进行比较
 * 2 没有整体添加操作
 * 3 实际上是三个指针，但最后一个用于设置填放位置。
 * */

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m-1 ,j = n-1;
        int p = m + n - 1;
        while (j>=0){
            if (i>=0 && nums2[j] > nums1[i]){
                nums1[p--] = nums2[j--];
            }else{
                nums1[p--] = nums1[i--];
            }
        }
    }
}
