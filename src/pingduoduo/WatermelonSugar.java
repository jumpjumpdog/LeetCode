package pingduoduo;

//这道题的意思就是求解数组中每个元素2因子的个数
public class WatermelonSugar {
    public  int maxSugar(int[]nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++)
            sum += get2Factor(nums[i]);
        return sum;
    }

    private int get2Factor(int num){
        int count =0;
        while(num % 2 == 0){
            count ++;
            num = num/2;
        }
        return count;
    }
}
