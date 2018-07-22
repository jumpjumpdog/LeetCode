import pingduoduo.BracketMatch;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        BracketMatch bracketMatch = new BracketMatch();

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine().toString().trim());
        String[]lines = new String [num];
        int index = 0;
        while(num-- >0){
            lines[index++] = sc.nextLine();
        }

       int sum = 0;
        //计算si
        for(int i=0;i<lines.length;i++){
            if(bracketMatch.singleMatchWithStack(lines[i].toCharArray()))
                sum++;
        }
        //计算si+si,si+sj,sj+si
        for(int i=0;i<lines.length;i++){
            for(int j=0;j<lines.length;j++)
            {
                if(i==j)
                    continue;
                char[]temp = (lines[i]+lines[j]).toCharArray();
                if(bracketMatch.singleMatchWithStack(temp))
                    sum++;
            }
        }

        System.out.println(sum);
    }

}