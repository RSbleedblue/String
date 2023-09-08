import java.util.*;

public class Solution {
    public static String encodeBase58(int n) {
        if (n == 0) {
            return "1";
        }
        
        StringBuilder res = new StringBuilder();
        String map = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        
        while (n > 0) {
            int convert = n % 58;
            res.append(map.charAt(convert));
            n = n / 58;
        }
        
        return res.reverse().toString();
    }
}
