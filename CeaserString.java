public static String caesarCipher(String s, int k) {
    StringBuilder res = new StringBuilder();
    for(int i = 0;i<s.length();i++){
        char currentChar = s.charAt(i);
        int ascii = currentChar;
        int increment = ascii+k;
        if(ascii >= 97 && ascii <= 122){
            ascii = (increment - 97) % 26 + 97;
        }
        else if(ascii >= 65 && ascii <= 90){
            ascii = (increment - 65) % 26 + 65;
        }
        currentChar = (char)(ascii);
        res.append(currentChar);
    }
    return res.toString();
}
