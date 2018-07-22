package String;

public class Palindrome {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        //正序字符串
        //逆序字符串
        String order ="";
        String reverseOrder = "";
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(Character.isLetter(temp)||Character.isDigit(temp))
                sb.append(temp);
        }

        order = sb.toString();
        reverseOrder = sb.reverse().toString();
        if(order.equals(reverseOrder))
            return true;
        else
            return false;
    }

}
