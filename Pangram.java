import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static boolean ninjaGram(String str) {

		// Write your code here
		int charSet[] = new int[26];
		String lower = str.toLowerCase();
		for(int i = 0;i<str.length();i++){
			char c = lower.charAt(i);
			if(c>='a' && c<='z'){
				charSet[c-'a']++;
			}
		}
		for(int count : charSet){
			if(count==0){
				return false;
			}
		}
		return true;
	}
}
