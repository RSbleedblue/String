public class ReverseAString {
    public static String Reverse(String str){
        String res = "";
        for(int i=str.length()-1;i>=0;i--){
            res+=str.charAt(i);
        }
        return res;
    }
    public static void main(String args[]){
        String str = "hello";
        String result = Reverse(str);
        System.out.println(result);
    }
}
