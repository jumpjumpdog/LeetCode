package Solution;

public class ArrayRotate {
//    public void rotate(int[] nums, int k) {
//        int[] result = new int[nums.length];
//        for(int i = 0;i<nums.length;i++){
//            result[i] = nums[i];
//        }
//        for (int i = 0; i < nums.length; i++)
//        {
//            nums[(i + k) % nums.length] = result[i];
//        }
//
//        return ;
//    }
    public void rotate(int[] nums, int k){
        int length = nums.length;
        k = k % length;
        if(length == 1)
            return;
        int curVal = nums[0];
        int i =0;
        int start = 0;
        while(length > 0){
            if(i+k < nums.length){
                int temp = nums[i+k];
                nums[i+k] = curVal;
                curVal =  temp;
                i = i+k;
            }
            else {
                int temp = nums[(i+k) % nums.length];
                nums[(i+k)% nums.length] = curVal;
                curVal = temp;
                i = (i+k) %nums.length;
                if(i == start){
                    start = i+1;
                    i = start;
                    curVal = nums[start];
                }
            }
            length --;
        }

    }
}
