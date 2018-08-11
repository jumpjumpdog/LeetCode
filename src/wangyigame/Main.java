package wangyigame;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by asus on 2018/8/11.
 */
public class Main {

   public  void process(){
       Scanner sc = new Scanner(System.in);
       int T = 0;
       T = sc.nextInt();

       String[]lines = new String[T];
       for(int i=0;i<T;i++){
           sc.nextInt();
           sc.nextLine();
           lines[i] = sc.nextLine();
       }

       Arrays.stream(lines).forEach(p->processOnce(p));
   }
   private void  processOnce(String str){
       LinkedList<Integer> sessionList = new LinkedList<>();
       String[]chars = str.split(" ");
       for(int i = 0;i<chars.length;i++){
           int id = Integer.valueOf(chars[i]);
           if(sessionList.contains(id)){
               Integer o = id;
               sessionList.remove(o);

           }
           sessionList.add(id);
       }

       Collections.reverse(sessionList);
       sessionList.stream().forEach(p->{
           System.out.print(p);
           System.out.print(" ");
       });
       System.out.println();
   }
}
