package beautycoding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PrefixSorting {
    public PrefixSorting(int[]pArray) {
        this.cakeArray =pArray;
        this.sortedCakeArray  = Arrays.copyOf(pArray,pArray.length);
        Arrays.sort(this.sortedCakeArray);
        this.finish = 0;
    }

    public int sort(){
        for(int i=0;i<cakeArray.length;i++){

        }
        return 1;
    }

    private void swap(int start, int end){
        int mid = (start+end)/2;
        for(int i=0;i<mid;i++){
            int temp =cakeArray[i];
            cakeArray[i] = cakeArray[mid ];
        }
    }
    //寻找第p大的元素的位置
    private int searchPosByValue(int v){
        for(int i=0;i<cakeArray.length;i++)
            if(v==cakeArray[i])
                return i;
        assert (false);
        return -1;
    }
    //寻找第p大的元素
    private int searchValueByPos(int p){
        int realPos = sortedCakeArray.length-1-p;
        return sortedCakeArray[realPos];
    }
    private int[]cakeArray;
    private  int[]sortedCakeArray;
    private  int finish;

}
