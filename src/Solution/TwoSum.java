package Solution;

import java.util.HashMap;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer>mp = new HashMap<>();
     
            for(int i=0;i<nums.length;i++){
                int complement = target - nums[i];
                if(mp.containsKey(complement)){
                    return new int[]{i,mp.get(complement)};
                }
                mp.put(nums[i],i);
            }
            return new int[]{};
    //        for(int i=0;i<nums.length;i++)
    //            mp.put(i, nums[i]);
    //        for(Integer a: mp.values()){
    //            int b = target- a;
    //            if(mp.values().contains(a)){
    //                for(Integer key: mp.keySet()){
    //                    if(mp.get(key) == a)
    //                    {
    //                        result[0] = key;
    //                        break;
    //                    }
    //                }
    //
    //                for(Integer key: mp.keySet()){
    //                    if(mp.get(key) == b && key!=result[0]){
    //                        result[1] = key;
    //                        return result;
    //                    }
    //                }
    //
    //            }
    //
    //
    //        }
    //            return result;
        }
}
