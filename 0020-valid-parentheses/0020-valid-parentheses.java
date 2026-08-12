import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i =0; i<s.length(); i++){
            //opening 
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{ //closing
            if(stack.isEmpty()){
                return false;
            }
            if((stack.peek() == '(' && ch == ')') || (stack.peek() == '{' && ch == '}') || (stack.peek() == '[' && ch ==']') ){
                stack.pop();
            }else{
                return false;
            }
            }
        }
         
    return stack.isEmpty(); }
   
}