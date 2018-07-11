import Solution.ArrayRotate;
import Solution.StockAnalysis;

public class Main {

    public static void main(String[] args) {
        ArrayRotate solution = new ArrayRotate();
        int[]arrays = new int[]{1,2};
        solution.rotate(arrays, 2);
        for(Object o: arrays){
            System.out.println(o);
        }

    }
}
