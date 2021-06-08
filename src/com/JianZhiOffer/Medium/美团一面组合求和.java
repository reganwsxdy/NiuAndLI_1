package com.JianZhiOffer.Medium;
/**
 * 美团一面面试题，力扣39，组合求和
 *
 * 输入：candidates = [2,3,6,7], target = 7,
 * 所求解集为：
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 美团一面组合求和 {
    public static void main(String[] args) {
        //19-26行实现得到一个整数数组+整数
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        sc.nextLine();
        String[] rec = sc.nextLine().split(" ");
        int[] candidate = new int[rec.length];
        for (int i = 0; i < rec.length; i++){
            candidate[i] = Integer.parseInt(rec[i]);
        }
        System.out.println(result(candidate, target));
    }

    public static List<List<Integer>> result(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(candidates, target, res, path, 0);
        return res;
    }

    public static void dfs(int[] candidate, int target, List<List<Integer>> res, List<Integer> path, int index){
        if (index == candidate.length)return;
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        dfs(candidate, target, res, path, index+1);
        if (target - candidate[index] >= 0){
            path.add(candidate[index]);
            dfs(candidate, target-candidate[index], res, path, index);
            path.remove(path.size()-1);
        }
    }

}
