package test.testIO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res =1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            if (t==0){//纬度切
                if (x==0|| x==360){
                    continue;
                }else{
                    res*=2;
                }
            }else {//经度切
                if (x>180){
                    x-=180;
                }
                if (map.get(x)==null){
                    map.put(x,1);
                    res*=2;
                }
            }
        }
        System.out.println(res);
    }
}
