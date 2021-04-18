package test.testIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str=bf.readLine())!=null){
            String[] inf = str.trim().split(" ");
            double n = Double.parseDouble(inf[0]);
            int m = Integer.parseInt(inf[1]);
            double sum = 0;
            if (n<0 && n>10000){
                break;
            }
            for (int i = 0; i < m; i++){
                sum += n;
                n = Math.sqrt(n);
            }
            System.out.printf("%.2f\n", sum);
        }
    }

}
