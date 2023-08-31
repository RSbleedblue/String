import java.util.* ;
import java.io.*; 
public class Solution {
    public static String reverseOnlyLetters(String res) {
        // Write your code here.
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<res.length();i++){
            int ascii = res.charAt(i);
            if((ascii>=65 && ascii <=90) || (ascii>=97 && ascii<=122)){
                stack.push(res.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i<res.length()){
            int ascii = res.charAt(i);
            if((ascii>=65 && ascii <=90) || (ascii>=97 && ascii<=122)){
                result.append(stack.pop());
                i++;
            }
            else{
                result.append(res.charAt(i));
                i++;
            }

        }
        return result.toString();
    }
}
