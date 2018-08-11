package WangYi;

import java.util.HashMap;
import java.util.Scanner;

public class Envelope {
    public void calculateLines(){
        Scanner sc = new Scanner(System.in);
        int[] chars = new int [26];
        int lines = 1;
        for(int i=0;i<26;i++){
            chars[i] = sc.nextInt();
        }
        //next()从遇到第一个有效字符（非空格、换行符）开始扫描，遇到第一个分隔符或结束符（空格’ ‘或者换行符 ‘\n’）时结束，此时无效字符任然保留在缓冲区中，可以读取
        //nextLine()则是扫描剩下的所有字符串知道遇到回车为止，并将回车从缓冲区中除去
        sc.nextLine();
        String str = sc.nextLine();
        //记录当前行的宽度
        int curLine = 0;
        int volume = 0;
        for(int i=0;i<str.length();i++)
        {
            volume = chars[str.charAt(i)-'a'];
            if(curLine+volume>100){
                lines++;
                curLine = volume;
            }
            else {
                curLine+=volume;
            }
        }
        System.out.println(lines+" "+curLine);
    }
}
