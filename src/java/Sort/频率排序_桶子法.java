package java.Sort; /**
 * 题目描述：给定字符串，按照字符出现的频率输出
 * 例 s=tree return eetr/eert
 * 依旧是桶方法
 * */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 频率排序_桶子法 {
    public String frequencySort(String s){
        //统计频率用hashmap
        char[] chr = s.toCharArray();
        Map<Character , Integer> CharToFre = new HashMap<>();
        for (char c:chr){
            CharToFre.put(c , CharToFre.getOrDefault(c , 0)+1);
        }

        List<Character>[] buckets = new ArrayList[chr.length+1];
        //向桶中添加元素之前所有桶都是空的，所以最初判断里必须有如果为空则new一个对象出来，保证添加的正确性
        //这步主要是用了上一步的键值对，然后将值为下标，添加键
        for (char key : CharToFre.keySet()){
            int frequent = CharToFre.get(key);
            if (buckets[frequent] == null){
                buckets[frequent] = new ArrayList<>();
            }
            buckets[frequent].add(key);
        }

        StringBuilder str = new StringBuilder();
        for (int i = buckets.length-1 ; i >=0 ; i--){//i对应的是下标，下标即是频率，也是输出的次数
            if (buckets[i] == null)continue;
            for (char c : buckets[i]){
                for (int j = 0; j<i; j++){
                    str.append(c);
                }
            }
        }
        return str.toString();
    }
}
