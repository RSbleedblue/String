/**
Take Two Strings as input. First string as "str" and second string as a "Target" string.

You are allowed to rotate the original string "str" multiple times.

Print "True" if "Target" string can be achieved by rotating the "str" any number of times else print "False".

Note: String "bcda" is a rotation of "abcd" but "bdca" is not a rotation of String "abcd".
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String target = sc.next();
        boolean result = isPossible(str,target);
        if(result){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
    public static boolean isPossible(String str,String target){
        if(str.length()!=target.length()){
            return false;
        }
        boolean ans = generateRotation(str,target);
        return ans;
    }
    public static boolean generateRotation(String str, String target){
        String temp = str;
        int n = str.length();
        for(int i = 0; i < str.length();i++){
                str = temp;      
                str = reverse(str,n-i,n-1);
                str = reverse(str,0,n-i-1);
                str = reverse(str,0,n-1);
                if(isEqual(str,target)){
                    return true;
                }
        }
        return false;
        
    }
    public static String reverse(String str, int start,int end){
        char[] stringArray = str.toCharArray();
        int i = start;
        int j = end;
        while(i<j){
            char temp = stringArray[i];
            stringArray[i] = stringArray[j];
            stringArray[j] = temp;
            i++;
            j--;
        }
        return new String(stringArray);
    }
    public static boolean isEqual(String str, String tar){
        for(int i = 0; i < str.length(); i++){
            char ch1 = str.charAt(i);
            char ch2 = tar.charAt(i);
            if(ch1 != ch2){
                return false;
            }
        }
        return true;
    }
}
