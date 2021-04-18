package test.testIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str=bf.readLine())!=null){
            String[] inf = str.trim().split(" ");
//            List<Object> list = Arrays.asList(inf);//放入集合

//            for (String word:inf) {
//                char[] sp = word.toCharArray();
//            }//二次拆分
            int[] num = new int[inf.length];
            for (int i = 0; i < inf.length; i++) {
                num[i] = Integer.parseInt(inf[i]);
            }//专为整形数组

        }
    }
}
