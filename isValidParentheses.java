import java.util.Stack;

public class Solution {
    public static boolean isValidParenthesis(String s) {
        // Write your code here.
         Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            //checking for opening bracket
            if(ch == '[' || ch == '{' || ch=='('){
                st.push(ch);
            }
            //checking for closing bracket

            else if((ch == ']' || ch == '}' || ch == ')') ){
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if(!isOpposite(top,ch)){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    private static boolean isOpposite(char stackTop,char currentBracket){
        if(stackTop == '{' && currentBracket == '}'){
            return true;
        }
        else if(stackTop == '(' && currentBracket ==')'){
            return true;
        }
        else if(stackTop == '[' && currentBracket == ']'){
            return true;
        }
        return false;
    }
}
