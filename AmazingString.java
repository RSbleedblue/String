public class Solution {
	public static String amazingStrings(String first, String second,String third) {
		// Write your code here.
		int charSet[] = new int[26];
		for(int i = 0;i<first.length();i++){
			charSet[first.charAt(i)-'A']++;
		}
		for(int i = 0;i<second.length();i++){
			charSet[second.charAt(i)-'A']++;
		}
		for(int i = 0;i<third.length();i++){
			charSet[third.charAt(i)-'A']++;
		}
		for(int i = 0;i<26;i++){
			if(charSet[i] %2 != 0){
				return "NO";
			}
		}
		return "YES";
	}
}
