import java.util.*;

public class Solution {

    public static int flipSomeBits(int num, int[] arr, int n) {
        String binary = binaryConvert(num);
        StringBuilder sb = new StringBuilder(binary);
        int maxPosition = 0;
        for (int place : arr) {
            if (place > maxPosition) {
                maxPosition = place;
            }
        }
        while (sb.length() < maxPosition) {
            sb.insert(0, '0');
        }
        for (int place : arr) {
            if (place > 0 && place <= sb.length()) {
                int index = sb.length() - place;
                char bit = sb.charAt(index);
                if (bit == '0') {
                    sb.setCharAt(index, '1');
                } else if (bit == '1') {
                    sb.setCharAt(index, '0');
                }
            }
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    private static String binaryConvert(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int rem = num % 2;
            sb.append(rem);
            num = num / 2;
        }
        return sb.reverse().toString();
    }
}
