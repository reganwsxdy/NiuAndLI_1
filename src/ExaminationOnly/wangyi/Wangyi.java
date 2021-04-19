package ExaminationOnly.wangyi;

import java.util.Scanner;

public class Wangyi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int w = sc.nextInt();
            int h = sc.nextInt();
            char[][] maze = new char[w][h];
            for (int j = 0; j < h; j++){
                maze[j] = sc.nextLine().toCharArray();
            }
        }
    }
}
