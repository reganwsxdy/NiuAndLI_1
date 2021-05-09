package java.Thought.SlideWindow;

/**
 * 最大连续1的问题，数组只含0、1，给定一个k，代表可以将k个0变为1，在所有情况中，可以得到的最长连续1的子串
 * 输入：A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
 * 输出：6
 * 解释：
 * [1,1,1,0,0,1,1,1,1,1,1]
 * 粗体数字从 0 翻转到 1，最长的子数组长度为 6。
 *
 * 思路转换：题目要求，1.连续为1的子串；2.最长。由于需要最长，因此要假设修改的0的数量就是k个，其次是连续，那么就是要找出一段连续子串，里面包含k个0，
 * 然后计算长度，然后用max更新结果，
 * 滑窗思路应用：本题中，每一次右窗移动都意味着有可能更新结果，因此要每次循环调用max计数，左窗移动则是调整，因此单独作为一个计数工具即可。
 * */


public class Sliding_Window {
    public int longestOnes(int[] A, int K){
        int res = 0;
        int left = 0, right = 0;
        int count = 0;
        int n = A.length;
        while (right< n){
            if (A[right] == 0){
                count++;
            }
            while (count>K){
                if (A[left++]==0){
                    count--;
                }
            }
            res = Math.max(res, right-left+1);//每次左指针移动后，满足count<=K时再进行计数
            right++;
        }
        return res;
    }
}
