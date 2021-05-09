package java.Thought.two_indicator;

/**
 * 题目描述：输入一个值，检查其是否是两个整数的平方和
 * 思路，将target开方，得到整数j，在i和j之间进行双指针遍历，
 *
 * */

public class sum_of_squares {
    public static boolean judgeSquareSum(int target){
        if (target < 0)return false;
        int i = 0,j = (int) Math.sqrt(target);

        while (i <= j){
            int sq = i * i + j * j;
            if (sq == target){
                return true;
            } else if (sq < target){
                i++;
            }else {
                j--;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(97));
    }
}
