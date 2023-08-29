import java.util.* ;
import java.io.*; 
public class Solution {
    public static String editSentence(String str){
        // Write your code here.
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                if(i == 0){
                    result.append((char) (currentChar + ('a' - 'A')));
                }
                else{
                    result.append(" ");
                    result.append((char) (currentChar + ('a' - 'A')));
                }

            } else {
                result.append(currentChar); 
            }
        }
        return result.toString();
    }
}
