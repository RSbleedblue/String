import java.util.* ;
import java.io.*; 
public class Solution {	
	public static String reverseString(String str) {
		// Write your code here.
		StringBuilder res = new StringBuilder(str);
		int i = 0;
		int j = str.length()-1;
		while(i<j){
			char temp = res.charAt(i);
			res.setCharAt(i, res.charAt(j));
			res.setCharAt(j, temp);
			i++;
			j--;	
		}
		return res.toString();
	}
}
