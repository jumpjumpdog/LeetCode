package contest93;

public class ReorderedPowerOf2 {
    public boolean reorderedPowerOf2(int N) {
        char[] array = Integer.toString(N).toCharArray();
        if(arrange(array,0,array.length))
            return true;
        return  false;
    }

    private boolean arrange(char[]array,int st, int len){
        if(st==len-1)
        {
            if(array[0] == '0')
                return false;
            if(DivisibleBy2(strTint(array)))
                return true;
            return false;
        }
        else {
            for(int i=st;i<len;i++){
                swap(array,st,i);
                if( arrange(array,st+1,len))
                    return true;
                swap(array,st,i);
            }
           return false;
        }
    }
    private  void swap(char[]array, int i,int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private int strTint(char[]array){
        int result= 0;
        for(int i=0;i<array.length;i++){
            result = result*10+(array[i]-'0');
        }
        return result;
    }
    private boolean DivisibleBy2(int N){
        while(N!=0){
            int remainder =N%2;
            N = N/2;
            if(remainder==1&&N==0)
                return true;
            else if (remainder ==1 && N!=0)
                    return  false;
        }
        return true;
    }
}
