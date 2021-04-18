package com.java.sort;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 题目描述：找到第K大的元素
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 * */

public class Kth_Element {
    //sort实现，一般考试不要这么写
    public int findKthLargest(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    //优先队列实现，默认是小顶堆，即越小优先级越高，优先出队
    public int findKthLargest_1(int[] nums, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i : nums){
            priorityQueue.add(i);
            if (priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }
    //堆排序实现（大根堆）
    //原理：大根堆做k-1次删除，此时堆顶元素就是第k大元素
    //实现：1 写一个堆的调整算法，将节点i的位置调整到最终位置；2 生成堆，调用n/2-1次堆调整算法；3 写一个交换算法
    /**编译有问题，之后再解决*/
    class heap{
        public int findKthLargest_heap(int[] nums, int k){
            int n = nums.length;
            buildHeap(nums, nums.length);
            for (int i = nums.length-1; i>=nums.length-k+1; i--){
                swap(nums, 0, i);
                n--;
                adjustNode(nums, 0, n);
            }
            return nums[0];
        }

        public void buildHeap(int[] a, int length){
            for (int i = length/2-1; i>=0; i--){
                adjustNode(a, i, length);
            }
        }
        //调整单个位置（值和位置都要交换）,用递归，程序出口是当top的值没变（t != top）
        public void adjustNode(int[] a, int top, int length){
            int left = top*2+1, right = top*2+2;
            int t = top;
            if (left<length && a[left] > a[t]){
                t = left;
            }
            if (right<length && a[right]>a[t]){
                t = right;
            }
            if (t!=top){
                swap(a, top, t);
                adjustNode(a, t, length);
            }
        }

        public void swap(int[] a, int i, int j){
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
    }
}
