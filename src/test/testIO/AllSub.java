package test.testIO;

import java.util.Scanner;

//18%
public class AllSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        getAllSub(s);
    }

    public static void getAllSub(String s) {
        if(s.length()==0 || s.length()>1000000){
            return;
        }
        else {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = 1; j < s.length(); j++) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
