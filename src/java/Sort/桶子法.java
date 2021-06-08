package java.Sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 题目描述：输出一个数组中出现频率最高的元素中前K高的元素。
 *  nums = [1,2,1,1,3,2] k=2 ,返回[1,2]
 *
 *  这个题的解题过程比较复杂，三个部分中都有难点
 *  1）建一个hashmap<key=元素，value=频率>
 *  2）建一个ArrayList数组，其数组下标是频率，数组元素是该频率的元素组成的一个内部ArrayList
 *  3）根据下标倒序输出元素
 *
 * */

public class 桶子法 {
    public int[] topKFrequent(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for (int key: map.keySet()){
            int frequent = map.get(key);//获取value来作为下标
            if (bucket[frequent] == null){
                bucket[frequent] = new ArrayList<>();
            }
            bucket[frequent].add(key);
        }

        List<Integer> TK = new ArrayList<>();
        for (int i = bucket.length-1 ; i >= 0 && TK.size()<=k ; i--){
            if (bucket[i] == null)continue;
            if (bucket[i].size() <= k-TK.size()){
                TK.addAll(bucket[i]);
            }else {
                TK.addAll(bucket[i].subList(0,k-TK.size()));
            }
        }

        int[] res = new int[nums.length];
        for (int i = 0 ; i < k ; i++){
            res[i] = TK.get(i);
        }

        return res;

    }
}
