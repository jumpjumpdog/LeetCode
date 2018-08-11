package WangYi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sugar {
    public void calculate(){
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer>hp = new HashMap<>();
        int peopleNum = 0;
        String[]keys = sc.nextLine().split(" ");
        for(int i=0;i<keys.length;i++){
            int key =Integer.valueOf(keys[i]);
            if(hp.keySet().contains(key)){
                int value =hp.get(key);
                hp.put(key,++value);
            }
            else
                hp.put(key,1);

        }

        for(int key:hp.keySet()){
            int value = hp.get(key);
            peopleNum += Math.ceil(((float)value)/(key+1))*(key+1);
        }
        System.out.println(peopleNum);

    }
}
