package Solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>result = new ArrayList<>();
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums2[j] < nums1[i]){
                j++;
            }
            else {
                result.add(nums1[i]);
                i++;
                j++;
            }

        }
        return  result.stream().mapToInt(Integer::valueOf).toArray();
    }
}
