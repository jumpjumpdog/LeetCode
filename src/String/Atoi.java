package String;

public class Atoi {
    public int myAtoi(String str) {
        int sign = 1;
        int i=0;
        int value = 0;
        String temp = "";
        str = str.trim();
        if(str.length()==0)
            return 0;
        if(str.length() ==1&&Character.isDigit(str.charAt(0)))
            return str.charAt(0)-'0';
        if(str.length() ==1&&!Character.isDigit(str.charAt(0)))
            return 0;

        if(str.charAt(i) == '+'){
            String tempStr = str.substring(i+1,str.length());
            value = strToInt(tempStr);
        }
        else if(str.charAt(i)=='-'){
            sign = -1;
            String tempStr = str.substring(i+1,str.length());
            value = strToInt(tempStr);
        }
        else if(!Character.isDigit(str.charAt(i))){
            return 0;
        }
        else {
            String tempStr = str.substring(i,str.length());
            value = strToInt(tempStr);
        }

        if(value > Integer.MAX_VALUE)
            return Integer.MAX_VALUE*sign;
        else
            return value*sign;
    }

    private int strToInt(String str){
        int result =0;
        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(!Character.isDigit(temp))
                break;
            result = result==0?(temp-'0'):(temp-'0')+result*10;
        }
        return result;
    }
}
