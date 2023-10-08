import java.util.HashMap;
public class OccurenceOfDifs {
    private static void print(String str){
        int vowelCount = 0;
        int consonantCount = 0;
        int number = 0;
        int space = 0;
        for(int i = 0;i<str.length();i++){
            char currentChar = str.charAt(i);
            if(isVowel(currentChar)){
                vowelCount++;
            }
            if(isConsonant(currentChar)){
                consonantCount++;
            }
            if(isNumber(currentChar)){
                number++;
            }
            if(currentChar == ' '){
                space++;
            }
            else{
                continue;
            }
        }
        System.out.println("Vowel Count: "+vowelCount);
        System.out.println("Consonant Count: "+consonantCount);
        System.out.println("Number: "+number);
        System.out.println("Space: "+space);
    }
    private static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
            return true;
        }
        return false;
    }
    private static boolean isConsonant(char c){
        if(isVowel(c) || isNumber(c) || c==' '){
            return false;
        }
        return true;
    }
    private static boolean isNumber(char c){
        int ascii = (int)(c);
        if(ascii >= 48 && ascii <= 57 ){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        String str = "Hello123 Ok";
        str = str.toLowerCase();
        print(str);
    }
}
