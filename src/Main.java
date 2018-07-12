import Solution.*;

public class Main {

    public static void main(String[] args) {
//        ArrayRotate solution = new ArrayRotate();
//        SingleNumber solution = new SingleNumber();
//        PlusOne plusOne = new PlusOne();
        TwoSum twoSum = new TwoSum();
        MoveZeroes moveZeroes = new MoveZeroes();
        int[]arrays = new int[]{3,2,4};
        arrays = twoSum.twoSum(arrays,6);
        for(Object o: arrays){
            System.out.println(o);
        }
    }
}
