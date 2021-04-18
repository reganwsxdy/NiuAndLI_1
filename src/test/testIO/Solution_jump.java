package test.testIO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution_jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        int count = 0;

    }

    private static int calcDis(int x1,int y1, int x2, int y2){
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }


}
