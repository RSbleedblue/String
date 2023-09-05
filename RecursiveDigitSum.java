public class superDigit {
    public static int superDigit(String n, int k) {
        String initialP = "";
        int i = 0;
        while (i < k) {
            initialP += n;
            i++;
        }
        int result = 0;
        while (initialP.length() > 1) {
            result = 0;
            for (i = 0; i < initialP.length(); i++) {
                int num = initialP.charAt(i) - 48;
                result += num;
            }
            String temp = String.valueOf(result);
            initialP = temp;
        }
        return result;
    }

    public static void main(String args[]){
        String str = "9875";
        int result = superDigit(str,4);
        System.out.println(result);
    }
}
