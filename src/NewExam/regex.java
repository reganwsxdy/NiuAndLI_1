package NewExam;

import java.util.*;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) throws Exception {
        String re = "(\\d{3,4})-(\\d{7,8})";
        String re2 = "(\\d\\{)-(\\d})";
        String ragex2="((and|AND)(\\s)+)[\\w]+[(=|<|>|<>|\\s+in\\s+)+]+#\\{[\\w]+\\}";
        Pattern p = Pattern.compile(re);
        for (String s : List.of("010-12345678", "020-9999999", "0755-7654321")) {
            if (!s.matches(re)) {
                System.out.println("测试失败: " + s);
                return;
            }
        }
        for (String s : List.of("010 12345678", "A20-9999999", "0755-7654.321")) {
            if (s.matches(re)) {
                System.out.println("测试失败: " + s);
                return;
            }
        }
        String s2 = "1{-1}";
        String s3 =  "and #{KSBM}";
        System.out.println("测试成功!");
        System.out.println(p.pattern());
        System.out.println(s2.matches(re2));
        System.out.println(s3.matches(ragex2));
    }
}
