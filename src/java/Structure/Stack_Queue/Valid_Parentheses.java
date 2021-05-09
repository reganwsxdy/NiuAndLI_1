package java.Structure.Stack_Queue;

import java.util.Stack;

/**
 * 题目描述：栈实现括号匹配
 * 这个特殊性在于括号有三个种类，要保证匹配不能按照之前的方式，最关键的在于，出栈元素和最新遍历到的元素必须能一对，否则就返回false
 * 最后如果栈空了则说明成功
 */


public class Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }else{//除三个左括号以外所有情况
                if (!stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                //如果不是以下三种情况，则为false
                boolean s1 = c==')' && top !='(';
                boolean s2 = c==']' && top !='[';
                boolean s3 = c=='}' && top !='{';
                if (s1 || s2 || s3){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
