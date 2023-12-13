import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = digitWithFreq(str);
        System.out.println(result);
    }
    public static int digitWithFreq(String str){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            int val = Character.valueOf(str.charAt(i))-48;
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int ans = Integer.MIN_VALUE;
        int ansKey = -1;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int key = e.getKey();
            int v = e.getValue();
            if(v > ans){
                ans = v;
                ansKey = key;
            }
        }
        return ansKey;
    }
}
