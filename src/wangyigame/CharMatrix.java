package wangyigame;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by asus on 2018/8/11.
 */
public class CharMatrix {
    public void process(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] result = new int [N];
        for(int i = 0;i<N;i++){
            result[i] = processOnce(sc);
        }
        Arrays.stream(result).forEach(p->System.out.println(p));
    }

    private int processOnce(Scanner sc){
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        char[][]matrix = new char[m][n];

        for(int i=0;i<m;i++){
            matrix[i] = sc.nextLine().toString().trim().toCharArray();
        }
        String word = sc.nextLine().trim().toString();
        return  calculate(matrix, word);
    }

    private int calculate(char[][]matrix, String word){
        int len = word.length();
        int count = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                //如果矩阵中当前字符不等于word的首字符 则无需比较
               if(word.charAt(0) != matrix[i][j])
                   continue;

               //横向比较
                if(j<n-len+1){
                    String temp = String.copyValueOf(matrix[i],j,len);
                    count = temp.equals(word)?count+1:count;
                }

                //纵向比较
                boolean flag = true;
                if(i<m-len+1){
                    for(int k = i;k<i+len;k++)
                    {
                        if(word.charAt(k-i)!=matrix[k][j])
                        {
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                        count++;
                }




                //斜方向比较
                flag =true;
                if(i<m-len+1&&j<n-len+1){
                    for(int k = i,p = j;k<i+len&&p<j+len;k++,p++){
                        if(word.charAt(k-i)!=matrix[k][p]){
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                        count++;
                }

            }
        }
        //横向搜索
//        for(int i=0;i<m;i++){
//            for(int j = i;j<n+1-len;j++){
//                String temp = String.copyValueOf(matrix[i],j,len);
//                count = temp.equals(word)?count++:count;
//            }
//        }
        //纵向搜索
        //首先矩阵转置
        //reverse(matrix);
//        for(int i=0;i<n;i++){
//            for(int j = i;j<m+1-len;j++){
//                String temp = String.copyValueOf(matrix[i],j,len);
//                count = temp.equals(word)?count++:count;
//            }
//        }
//        //矩阵转置
//        for(int i=0;i<n;i++){
//
//        }

        return  count;
    }

//    private void reverse(char[][]matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//
//        char[][] newMatrix = new char[n][m];
//        for(int i=0;i<m;i++){
//            for(int j = 0;j<n;j++)
//                newMatrix[j][i] = matrix[i][j];
//        }
//        matrix = newMatrix;
//    }
}

