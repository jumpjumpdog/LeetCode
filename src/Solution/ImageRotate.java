package Solution;

public class ImageRotate {
    public void rotate(int[][] matrix) {
        int len  = matrix.length;
        int[][]resultMatrix = new int[len][len];
        for(int i = 0;i<matrix.length/2;i++){
            int[]temp = matrix[i];
            matrix[i] =matrix[len-i-1];
            matrix[len-i-1] =temp;
        }
        for(int i=0;i<matrix.length;i++)
            for(int j = 0;j<matrix[i].length;j++) {
                resultMatrix[len - 1 - j][i] = matrix[i][j];
            }

        for(int i = 0;i<resultMatrix.length;i++)
            System.arraycopy(resultMatrix[i],0,matrix[i],0,matrix[i].length-1);
            

        for(int i = 0;i<matrix.length/2;i++){
            int[]temp = matrix[i];
            matrix[i] =matrix[len-i-1];
            matrix[len-i-1] =temp;
        }
    }



    //pos用来表示处理矩阵的第几层
//    public void rotate(int[][] matrix, int pos){
//
//    }
}
