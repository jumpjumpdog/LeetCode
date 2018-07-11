package Solution;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int len  = nums.length;
        Arrays.sort(nums);
        for(int i =0;i<len;i=i+2){
            if(nums[i]!= nums[i+1]){
                return nums[i];
            }
        }
       return nums[nums.length-1];
    }
}
