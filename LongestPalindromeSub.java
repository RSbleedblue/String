import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = longestPS(str);
        System.out.println(result);
    }
    public static String longestPS(String str){
        String ans = "";
        int len = Integer.MIN_VALUE;
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                String sub = str.substring(i,j+1);
                int temp = sub.length();
                if(isPalindrome(sub) && temp > len){
                    len = temp;
                    ans = sub;
                }
            }
        }
        return ans;
    }
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
