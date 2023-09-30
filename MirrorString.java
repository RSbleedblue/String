import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean isReflectionEqual(String s) {
        // Write your code here.
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='H' || s.charAt(i)=='I' || s.charAt(i) == 'M' || 
            s.charAt(i) == 'O' || s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V' ||
            s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y'){
                sb.append(s.charAt(i));
            }
            else{
                return false;
            }
          }
          String result = sb.toString();
          boolean ans = checkPalindrome(result);
          return ans;
    }
    private static Boolean checkPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--){
            sb.append((s.charAt(i)));
        }
        String compare = sb.toString();
        return (s.equals(compare));
    }
}
