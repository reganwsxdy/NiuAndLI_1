package ExaminationOnly.wangyi;

import java.util.*;

public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();
        Map<Integer, Players> map = new HashMap<>();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < T; i++){
            int ans = 0;
            for (int j = 0; j < N; j++){
                int id = sc.nextInt();
                int score = sc.nextInt();
                if (!map.containsKey(id)){
                    map.put(id, new Players(score, false));
                    nums.add(score);
                }else {
                    Players players = map.get(id);
                    players.score = Math.max(score, players.score);
                }
                Collections.sort(nums);
                int len = nums.size();
                int calc;
                if (len%2 == 1){
                    calc = nums.get(len/2);
                }else {
                    calc = (nums.get(len/2)+nums.get((len/2) -1))/2;
                }
                if (score == calc){
                    if (!map.get(id).flag){
                        ans++;
                        map.get(id).flag=true;
                    }
                }
            }
            System.out.println(ans);
        }
    }

    static class Players{
        int score;
        boolean flag;

        public Players(int score, boolean flag){
            this.score = score;
            this.flag = flag;
        }
    }
}


