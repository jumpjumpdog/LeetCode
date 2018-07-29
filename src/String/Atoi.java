package String;

public class Atoi {
    public int myAtoi(String str) {
        int sign = 1,value=0;
        String temp = "";

        //先对字符串进行去trim操作 将前后的空格删除
        str = str.trim();
        //空字符串返回0
        if(str.length()==0)
            return 0;

        //+开头的字符串，-开头的字符串，数字开头的字符串，三非开头的字符串
        if(str.charAt(0) == '+'){
            String tempStr = str.substring(1,str.length());
            value = strToInt(tempStr,sign);
        }
        else if(str.charAt(0)=='-'){
            sign = -1;
            String tempStr = str.substring(1,str.length());
            value = strToInt(tempStr,sign);
        }
        else if(!Character.isDigit(str.charAt(0))){
            return 0;
        }
        else {
            String tempStr = str.substring(0,str.length());
            value = strToInt(tempStr,sign);
        }

        return value;
    }

    private int strToInt(String str,int sign){
        int result =0;
        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(!Character.isDigit(temp))
                break;
            //再数量级提高之前 检测是否越界
            if(result>Integer.MAX_VALUE/10)
            {
                if(sign==1)
                {
                   return Integer.MAX_VALUE;
                }
                else
                {
                    return Integer.MIN_VALUE;
                }

            }
            else if(result==Integer.MAX_VALUE/10){
                if(sign==1){
                    int remainder = Integer.MAX_VALUE%10;
                    if(temp-'0'<=remainder)
                        result = result==0?(temp-'0'):(temp-'0')+result*10;
                    else
                        result = Integer.MAX_VALUE;
                    return result;
                }
                else {
                    int remainder = Integer.MAX_VALUE%10;
                    if(temp-'0'<remainder+1){
                        result = result==0?(temp-'0'):(temp-'0')+result*10;
                        return result*sign;
                    }

                    else
                        return Integer.MIN_VALUE;
                }
            }



            result = result==0?(temp-'0'):(temp-'0')+result*10;


        }
        return result*sign;
    }
}
