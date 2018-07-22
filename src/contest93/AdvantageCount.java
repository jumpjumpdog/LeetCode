package contest93;

import java.util.*;

public class AdvantageCount {
    private  class pair{
        public int value = 0;
        public int pos = 0;
        public pair(int value, int pos) {
        this.value = value;
        this.pos = pos;
        }
    }

    private  class  sortByValue implements Comparator<pair>{
        @Override
        public int compare(pair o1, pair o2) {
            return o1.value-o2.value;
        }
    }
    private class sortByPos implements Comparator<pair>{
        @Override
        public int compare(pair o1, pair o2) {
            return o1.pos-o2.pos;
        }
    }
    public int[] advantageCount(int[] A, int[] B) {
        pair[]aPair = new pair[A.length];
        pair[]bPair = new pair[B.length];
        int[]result = new int[B.length];

        for(int i=0;i<A.length;i++){
            aPair[i] = new pair(A[i],i);
        }
        for(int i=0;i<B.length;i++){
            bPair[i] = new pair(B[i],i);
        }


        Arrays.sort(aPair,new sortByValue());
        Arrays.sort(bPair,new sortByValue());


        int p=0,q=0,len = A.length;
       LinkedList<pair>tmp = new LinkedList<>();

        while(p<len&&q<len){
            if(aPair[p].value>bPair[q].value){
                result[bPair[q].pos] = aPair[p].value;
                p++;
                q++;
            }
            else
            {
                tmp.add(aPair[p]);
                p++;
            }
        }

        for(int i=0;i<result.length;i++){
            if(result[i] == 0) {
                result[i] = tmp.poll().value;
            }
        }
        return result;
//        Arrays.sort(A);
//        int[]result = new int[A.length];
//        LinkedList<Integer>list = new LinkedList<>();
//
//
//        //将数据赋值到list中
//        for(int i=0;i<A.length;i++){
//            list.add(A[i]);
//        }
//
//        for(int i=0;i<B.length;i++){
//            for(int j=0;j<list.size();j++) {
//                Integer temp = list.get(j);
//                if(temp == null)
//                    continue;
//                if(temp>B[i]){
//                    result[i] = temp;
//                    list.set(j,null);
//                    break;
//                }
//            }
//        }
//
//        Iterator<Integer> iter = list.iterator();


//        System.out.println("list:");
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();
//        System.out.println("result:");
//        for(int i=0;i<result.length;i++)
//            System.out.print(result[i]+" ");
//        System.out.println();


        //删除list中的null节点
//        iter = list.iterator();
//        while(iter.hasNext()){
//            Integer temp = iter.next();
//            if(temp == null)
//                iter.remove();
//        }
//        iter = list.iterator();
//        for(int i=0;i<result.length;i++){
//            if(result[i] == 0)
//                result[i] = iter.next();
//        }
//        return  result;

//        int[]max = new int[A.length];
//        System.arraycopy(A,0,max,0,max.length);
//        arrange(A,0,A.length,max,B);
//        return max;
    }
//    private void arrange(int[]array, int st, int len,int[]max,int[]B){
//        if(st == len-1)
//        {
//            if(getAdvantage(array,B)>getAdvantage(max,B)){
//                System.arraycopy(array,0,max,0,max.length);
//            }
//        }
//        else {
//            for(int i=st;i<len;i++){
//                swap(array, st,i);
//                arrange(array, st+1,len,max,B);
//                swap(array, st,i);
//            }
//        }
//    }
//    private int getAdvantage(int[]A, int[]B){
//        int advanatage =0;
//        for(int i=0;i<A.length;i++){
//            if(A[i] > B[i])
//                advanatage++;
//        }
//        return advanatage;
//    }
//    private void swap(int[]array,int i,int j){
//        int temp = array[i];
//        array[i] = array[j] ;
//        array[j] = temp;
//    }
}
