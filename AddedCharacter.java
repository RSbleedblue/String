import java.util.* ;
import java.io.*; 
public class Solution {
	public static char findAddedCharacter(String s, String t) {
		// Write your code here.
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0;i<s.length();i++){
			char ch = s.charAt(i);
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		char result = 'a';
		for(int i = 0;i<t.length();i++){
			char ch = t.charAt(i);
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)-1);
				if(map.get(ch) == 0){
					map.remove(ch);
				}
			}
			else{
				result = ch;
				return result;
			}
			
		}
		return result;
		
	}
}
