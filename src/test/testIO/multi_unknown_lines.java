/**
 * 输入任意数量的学生和成绩，输出其排名
 * */
package test.testIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class multi_unknown_lines {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str=bf.readLine())!=null){//这里只是防止初始输入为空的情况
            //第一行 长度
            int n = Integer.parseInt(str.trim());
            //第二行 order还是reverse
            int ro = Integer.parseInt(bf.readLine().trim());
            String[] name = new String[n];
            int[] score = new int[n];
            //第三行开始 姓名+成绩拆分后分别进入两个数组
            String res;
            for (int i = 0; i < n; i++) {
                res = bf.readLine().trim();
                String[] temp = res.split(" ");
                name[i] = temp[0];
                score[i] = Integer.parseInt(temp[1]);
            }
            if (ro == 0){
                for (int i = 0; i<n; i++){
                    int k = i;
                    for (int j=i+1; j<n; j++){
                        if (score[k]<score[j]){
                            k = j;
                        }
                    }
                    int tmp = score[i];
                    score[i] = score[k];
                    score[k] = tmp;
                    String stmp = name[i];
                    name[i] = name[k];
                    name[k] = stmp;
                }
            }else {
                for (int i = 0; i<n; i++){
                    int k = i;
                    for (int j=i+1; j<n; j++){
                        if (score[k]>score[j]){
                            k = j;
                        }
                    }
                    int tmp = score[i];
                    score[i] = score[k];
                    score[k] = tmp;
                    String stmp = name[i];
                    name[i] = name[k];
                    name[k] = stmp;
            }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(name[i])
                        .append(" ")
                        .append(score[i])
                        .append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
        }
    }
}


