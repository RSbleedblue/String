public class PalindromeStringCheck {
    public static boolean check(String str) {
        StringBuilder cleanedStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleanedStr.append(Character.toLowerCase(ch));
            }
        }

        StringBuilder reversedStr = new StringBuilder(cleanedStr).reverse();

        return cleanedStr.toString().equals(reversedStr.toString());
    }

    public static void main(String args[]) {
        String str = "A man, a plan, a canal, Panama";
        boolean ans = check(str);
        System.out.println(ans);
    }
}
