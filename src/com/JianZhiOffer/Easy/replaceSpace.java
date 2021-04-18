package com.JianZhiOffer.Easy;
/**
 * 将字符串中的空格替换为指定形式
 * */
public class replaceSpace {
    public static String replaceSpace(String s){
        StringBuffer sb = new StringBuffer();
        char[] cs = s.toCharArray();
        for(int i = 0; i <s.length(); i++){
            if(cs[i] == ' '){
                sb.append("%20");
            }else {
                sb.append(cs[i]);
            }
        }
        return sb.toString();
    }

    public static String replaceSpace1(String s){
        if (s == null || "".equals(s)){
            return s;
        }
        return s.replaceAll(" ","%20");
    }

    public static void main(String[] args) {
        String s = "We Are Happy";
        System.out.println(replaceSpace1(s));
    }
}
