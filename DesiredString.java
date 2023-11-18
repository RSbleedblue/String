/*
Take a string as input. Print the count of all the substrings that start with ‘A’ and end with ‘A’. Also print the length of the longest such substring in the second line. In the third line, print that longest substring.

If no such substring exists, print -1.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        desiredString(str);
    }
    public static void desiredString(String str){
        int count = 0;
        int len = Integer.MIN_VALUE;
        String lar = "";
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j < str.length(); j++){
                String sub = str.substring(i,j+1);
                if(isTrue(sub)){
                    count++;
                    if(sub.length() > len){
                        len = sub.length();
                        lar = sub;
                    }
                }
            }
        }
        if(len == Integer.MIN_VALUE){
            System.out.println(-1);
            return;
        }
        System.out.println(count);
        System.out.println(len);
        System.out.println(lar);
    }
    public static boolean isTrue(String s){
        if(s.charAt(0) =='A' && s.charAt(s.length()-1) == 'A'){
            return true;
        }
        return false;
    }
}
