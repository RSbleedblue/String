import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = countNum(str);
        System.out.println(result);
    }
    public static int countNum(String str){
        int result = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <='9'){
                while(i<str.length()-1 && str.charAt(i) >='0' && str.charAt(i)<='9'){
                    i++;
                }
                result++;
            }
        }
        return result;
    }
}
