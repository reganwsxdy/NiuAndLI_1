package NewExam;
/**最大收益
 * 样例输入输出：
 * in：
 * 4
 * 1 2 3 3 为订单开始时间
 * 3 4 5 6 为订单结束时间
 * 200 150 180 210 订单code
 *
 * out：
 * 410
 * */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Order> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            Order order = new Order();
            order.code = i+1;
            order.start = sc.nextInt();
            map.put(i+1, order);
        }
        for (int i = 0; i < n; i++){
            map.get(i+1).end = sc.nextInt();
        }
        int[] cost = new int[n];
        for (int i = 0; i < n; i++){
            cost[i] = sc.nextInt();
        }
        int[] pre = new int[n+1];
        for (int i = 1; i <= n; i++){
            Order order = map.get(i);
            int start = order.start;
            int count = 0;
            int maxEnd = 0;
            for (int j = 0; j < n; j++){
                Order secondOrder = map.get(j+1);
                int tempEnd = secondOrder.end;
                if (tempEnd <= start && maxEnd < tempEnd){
                    count = j + 1;
                    maxEnd = tempEnd;
                }
            }
            pre[i] = count;
        }
        int[] opt = new int[n+1];
        opt[0] = 0;
        for (int i = 1; i < opt.length; i++){
            opt[i] = Math.max(opt[i-1], opt[pre[i]]+cost[i-1]);
        }
        System.out.println(opt[n]);
    }

    public static class Order{
        int code;
        int start;
        int end;
    }
}
