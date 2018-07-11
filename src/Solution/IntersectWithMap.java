package Solution;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectWithMap {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> num1Map = new HashMap<>();
        Map<Integer, Integer>num2Map = new HashMap<>();
        for(int a: nums1){
            if(num1Map.containsKey(a)){
                int originalValue = num1Map.get(a);
                num1Map.put(a, originalValue+1);
            }
            else {
                num1Map.put(a,1);
            }
        }
      for(int a: nums2){
            if(num1Map.containsKey(a)&& num1Map.get(a)!=0){
                result.add(a);
                num1Map.put(a, num1Map.get(a)-1);
            }
      }
      int[]resultArray = new int[result.size()];
        for(int i=0;i<result.size();i++){
            resultArray[i] = result.get(i);
        }
    return resultArray;

    }
}
