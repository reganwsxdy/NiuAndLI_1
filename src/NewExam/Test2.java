package NewExam;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++){
            scores[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < m; i++){
            cards[i] = sc.nextInt();
        }

        int start = 0;
        int maxCost = scores[0];
        int count = m;
        while (count!=0){
            int temp = -1;
            int max = 0;
            for (int j = 0; j < m; j++){
                int jump = cards[j];
                if (jump == 0){
                    continue;
                }
                if (max < scores[start + jump]){
                    max = scores[start + jump];
                    temp = j;
                }
            }
            if (temp == -1){
                break;
            }
            start+=cards[temp];
            maxCost+= scores[start];
            cards[temp] = 0;
            count--;
        }
        System.out.println(maxCost);
    }
}
