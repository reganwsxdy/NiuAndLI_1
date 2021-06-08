package NewExam;

import java.util.regex.Pattern;

public class regex2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java");
        String test="123Java456Java789Java";
        String[] result = pattern.split(test,3);//返回的最后一个值不再进行匹配
        String[] ss = test.split("Java");
        for(String s: result){
            System.out.println(s);
        }
        for (String sss:ss) {
            System.out.print(sss + " ");
        }
    }
}
