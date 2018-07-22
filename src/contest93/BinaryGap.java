package contest93;

public class BinaryGap {
    public int binaryGap(int N) {
        String bStr = Integer.toBinaryString(N);
        int i=0;
        int start = 0;
        int max = 0;
        while(i<bStr.length()&&bStr.charAt(i)!='1'){
            i++;
        }
        if(i == bStr.length())
            return 0;
        start = i;
        i++;
        while(i<bStr.length()){
            while(i<bStr.length()&&bStr.charAt(i)!='1'){
                i++;
            }
            if(i == bStr.length())
                return max;

            max = max>i-start?max:i-start;
            start = i;
            i++;
        }
        return max;
    }

}
