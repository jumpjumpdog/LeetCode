package Solution;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits){
        plusOne(digits,0,digits.length-1,1);
        int[]result;
        if(digits[0] == 10){
            result = new int[digits.length+1];
            result[0] = 1;
            result[1] = 0;
           System.arraycopy(digits,1,result,2,digits.length-1);
        }
        else {
            result = digits;
        }
        return result;
    }


    private void plusOne(int[]digits, int start, int end, int add){
        if(start == end && add  == 0){
            return;
        }
        else if(start == end && add == 1){
            if(digits[start] == 9){
                digits[start] = 10;
            }
            else
            {
                digits[start] = digits[start]+1;
            }
        }
        else {
            int sum = digits[end] +add;
            digits[end] = sum %10;
            add = sum/10;
            plusOne(digits,start,end-1,add);
        }
    }



//    public int[] plusOne(int[] digits) {
//        digits = getArray(getNumber(digits)+1);
//        ArrayList<Integer>result = new ArrayList<>();
//        for(int i=0;i<digits.length;i++){
//            result.add(digits[digits.length-i-1]);
//        }
//        return result.stream().mapToInt(Integer::valueOf).toArray();
//    }

//    public long getNumber(int[] digits){
//        int len = digits.length;
//        long level = 1;
//        long number =0;
//        for(int i=len-1;i>=0;i--){
//            number += digits[i] * level;
//            level *=10;
//        }
//        return  number;
//    }
//
//    public int[]getArray(long num){
//        ArrayList<Integer>digits = new ArrayList<>();
//        int level = 10;
//        int remainder =0;
//        while(num!=0){
//             remainder = (int)(num % level);
//             num = num / level;
//             digits.add(remainder);
//        }
//        return digits.stream().mapToInt(Integer::valueOf).toArray();
//    }
}
