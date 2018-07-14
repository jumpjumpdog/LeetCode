package String;

public class Reverse {
    public int reverse(int x) {
        if(0 == x)
            return  0;
        String strValue = Integer.toString(x);
        StringBuilder resultSB = new StringBuilder();
        int len = strValue.length();
        if('-'==strValue.charAt(0)){
            resultSB.append('-');
            int i = len-1;
            while(strValue.charAt(i)=='0'){
                i--;
            }
            while(i!=0){
                resultSB.append(strValue.charAt(i));
                i--;
            }
        }
        else{
            int i = len-1;
            while(strValue.charAt(i)=='0'){
                i--;
            }
            while(i!=-1){
                resultSB.append(strValue.charAt(i));
                i--;
            }
        }
        try{
            return Integer.valueOf(resultSB.toString());
        }
        catch (Exception NumberFormatException){
            return 0;
        }

    }
}
