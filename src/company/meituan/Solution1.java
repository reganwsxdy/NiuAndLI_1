package company.meituan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str=bf.readLine())!=null) {
            if (str.length()>1000000 || str.length()<1){
                break;
            }
            Map<String, Integer> map = new HashMap<>();
            String[] st = str.split("");
            for (String temp : st) {
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
            int res=1;
            for (Integer value:map.values()){
                res*=value+1;
            }
            System.out.println(res%20210101);
        }
    }
}
