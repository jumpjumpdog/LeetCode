import Solution.*;

public class Main {

    public static void main(String[] args) {
//        ArrayRotate solution = new ArrayRotate();
//        SingleNumber solution = new SingleNumber();
//        PlusOne plusOne = new PlusOne();
//        TwoSum twoSum = new TwoSum();
//        MoveZeroes moveZeroes = new MoveZeroes();
        ImageRotate imageRotate = new ImageRotate();
        int[][]arrays = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        imageRotate.rotate(arrays);
        for(int i =0;i<arrays.length;i++)
        {
            for(int j = 0;j<arrays[i].length;j++)
                System.out.print(arrays[i][j]);
            System.out.println();
        }
    }
}
