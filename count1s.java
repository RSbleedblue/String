import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = count1s(str);
        System.out.println(result);
    }
    public static int count1s(String str){
        int result = 0;
        for(int i = 0; i < str.length();i++){
            int temp = 0;
            char cVal = str.charAt(i);
            if(cVal == '1'){
                
                while(i<str.length() && str.charAt(i) == '1'){
                    i++;
                    temp++;
                }
            }
            else{
                continue;
            }
            result = Math.max(result,temp);
        }
        return result;
    }
}
