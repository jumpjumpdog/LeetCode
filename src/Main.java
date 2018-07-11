import Solution.ArrayRotate;
import Solution.SingleNumber;
import Solution.StockAnalysis;

public class Main {

    public static void main(String[] args) {
//        ArrayRotate solution = new ArrayRotate();
        SingleNumber solution = new SingleNumber();
        int[]arrays = new int[]{17,12,5,-6,12,4,17,-5,2,-3,2,4,5,16,-3,-4,15,15,-4,-5,-6};
        solution.singleNumber(arrays);
        for(Object o: arrays){
            System.out.println(o);
        }
    }
}
