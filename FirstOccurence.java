import java.util.* ;
import java.io.*; 
public class Solution {
	public static char firstNonRepeating(String str) {
		// Write your code here
		int aux[] = new int[26];
		for(int i=0;i<str.length();i++){
			int index = (int)(str.charAt(i) - 'a');
			aux[index]++;
		}
		int value=0;
		boolean check = false;
		for(int i=0;i<26;i++){
			if(aux[i]==1){
				value = i;
				check  = true;
				break;
			}
		}
		if(check){
			char ans = (char)(value+'a');
			return ans;
		}
		char ans = '#';
		return ans;
		
	}
}
