import java.util.*;
public class Solution {

    public static boolean isAnagram(String str1, String str2) {
        //Your code goes here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<str1.length();i++){
            char ch = str1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i = 0;i<str2.length();i++){
            char ch = str2.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }
            }
            else{
                map.put(ch, 1);
            }
        }
        return map.isEmpty();
    }

}
