package String;

public class ReverseString {
    public String reverseString(String s) {
        int len = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=len-1;i>=0;i--){
            stringBuilder.append(s.charAt(i));
        }
            return stringBuilder.toString();
    }
}
