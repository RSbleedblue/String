public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
		String words[] = str.split(" ");
		StringBuilder result = new StringBuilder();
		for(int i = words.length-1;i>=0;i--){
			String reverseWord = words[i];
			result.append(reverseWord);
			if(i>0){
				result.append(" ");
			}
		}
		return result.toString();
		
		
	}
}
