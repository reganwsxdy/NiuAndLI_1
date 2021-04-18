package test.testIO;

/**
 * 单行输入
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mluti_times_string {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=br.readLine())!=null){//这个while循环里只是对单行的操作
            int len = str.length();
            int st = 0;
            while(len>=8){//原字符串没有改变
                System.out.println(str.substring(st,st+8));
                st+=8;
                len-=8;
            }
            if(len>0){
                char[] tmp = new char[8];
                for(int i = 0;i<8;i++){
                    tmp[i]='0';
                }
                for(int i = 0;st<str.length();i++){
                    tmp[i]=str.charAt(st++);
                }
                System.out.println(String.valueOf(tmp));
            }
        }
    }
}


