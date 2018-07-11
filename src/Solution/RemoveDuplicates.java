package Solution;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public int[] removeDuplicates(int[]nums){
        int length = nums.length;
        int curPos = 0;
        boolean is_dulicated = false;
        for(int i=1;i<length;i++) {
            if (nums[i] == nums[curPos]) {
                nums[i] = -1;
                is_dulicated = true;
            }
            if (nums[i] > nums[curPos]){
                curPos  = i;
                is_dulicated = false;
            }
        }

        List<Integer>list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        list.removeIf(item->{
            if(item == -1)
                return true;
            else
                return false;
        });
        nums = list.stream().mapToInt(Integer::valueOf).toArray();
//        List<Integer>list = Arrays.stream(nums).boxed().collect(Collectors.toList());
//        list.removeIf(item->{
//            if(item == -1)
//                return true;
//            else
//                return false;
//        });
//        for(int item: nums){
//            System.out.println(item);
//        }
//        for(int i=0;i<nums.length;i++){
//            if(nums[i] ==  -1){
//                for(int k = i+1;k<nums.length;k++)
//                    if(nums[k]!=-1){
//                        nums[i] = nums[k];
//                        nums[k] = -1;
//                        break;
//                    }
//            }
//        }

           return nums;
        }
}
