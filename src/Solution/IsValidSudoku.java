package Solution;

import java.util.HashMap;
import java.util.HashSet;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if(!checkBox(board))
            return false;
        if(!(checkLine(board)))
            return false;
        if(!checkRow(board))
            return false;
    return true;
    }

    private boolean checkBox(char[][]board){
        for(int i=0;i<9;i=i+3){
           for(int j = 0;j<9;j=j+3){
               HashSet<Character> set = new HashSet<>();
               for(int p =0;p<3;p++)
                   for(int q = 0;q<3;q++)
                   {
                       if(board[i+p][j+q] == '.')
                           continue;
                       if(set.contains(board[i+p][j+q]))
                           return false;
                       else
                           set.add(board[i+p][j+q]);
                   }
           }

        }
        return  true;
    }
    private  boolean checkRow(char[][]board){
        for(int j=0;j<board[0].length;j++){
            HashSet<Character>set = new HashSet<>();
            for(int i=0;i<board.length;i++){
                if(board[i][j] == '.')
                    continue;
                if(set.contains(board[i][j])){
                    return  false;
                }
                else {
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }

    private boolean checkLine(char[][] board){
        for(int i=0;i<board.length;i++){
            HashSet<Character>set = new HashSet<>();
            for(int j=0;j<board[i].length;j++){
                if(board[i][j] == '.')
                    continue;
                if(set.contains(board[i][j]))
                    return false;
                else {
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
}
