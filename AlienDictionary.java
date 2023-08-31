import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean alienDictonary(int n, String words[], String order) {
        // Write your code here..
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<order.length();i++){
            map.put(order.charAt(i), i);
        }
        for(int i = 0;i<words.length-1;i++){
            String s1 = words[i];
            String s2 = words[i+1];
            int len = Math.min(s1.length(),s2.length());
            for(int j = 0;j<len;j++){
                if(map.get(s1.charAt(j))>map.get(s2.charAt(j))){
                    return false;
                }
                break;
            }
        }
        return true;
    }

}
