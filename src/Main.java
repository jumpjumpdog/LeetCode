import Solution.ArrayRotate;
import Solution.PlusOne;
import Solution.SingleNumber;
import Solution.StockAnalysis;

public class Main {

    public static void main(String[] args) {
//        ArrayRotate solution = new ArrayRotate();
//        SingleNumber solution = new SingleNumber();
        PlusOne plusOne = new PlusOne();
        int[]arrays = new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        arrays = plusOne.plusOne(arrays);
        for(Object o: arrays){
            System.out.println(o);
        }
    }
}
