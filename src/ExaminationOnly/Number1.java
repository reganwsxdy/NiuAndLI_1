package ExaminationOnly;

import java.util.*;
import java.util.stream.Collectors;

public class Number1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, String> data = new HashMap<>();

        for (int i = 0; i < n; i++){
            String recond = in.nextLine();
            String[] reconds = recond.split(" ");
            String id = reconds[0];
            String name = reconds[1];
            data.put(id, name);
        }
        Map<String, Long> map = data.values().stream().collect(Collectors.groupingBy(p->p,Collectors.counting()));
        int result = 0;
        for (Long temp: map.values()){
            if(temp >= 2){
                result++;
            }
        }
        System.out.println(result);
    }
}
