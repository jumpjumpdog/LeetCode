import Solution.*;

public class Main {

    public static void main(String[] args) {
//        ArrayRotate solution = new ArrayRotate();
//        SingleNumber solution = new SingleNumber();
//        PlusOne plusOne = new PlusOne();
        MoveZeroes moveZeroes = new MoveZeroes();
        int[]arrays = new int[]{0,1,0,3,12};
        moveZeroes.moveZeroes(arrays);
        for(Object o: arrays){
            System.out.println(o);
        }
    }
}
