package com.ran.stack;

import java.util.Stack;

/**
 * ClassName: ValidParenthesis_20
 * Description:
 * date: 2022/2/13 20:43
 *
 * @author ran
 */
public class ValidParenthesis_20 {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c:ch){
            if(!stack.isEmpty()){
                if(c==')'&&stack.peek()=='('){
                    stack.pop();
                }else if(c==']'&&stack.peek()=='['){
                    stack.pop();
                }else if(c=='}'&&stack.peek()=='{'){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }else{
                stack.push(c);
            }
        }
        return stack.size()==0;
    }
}
