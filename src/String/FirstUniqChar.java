package String;

import java.util.HashMap;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hp = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hp.containsKey(s.charAt(i))){
                hp.put(s.charAt(i),s.length());
            }
            else {
                hp.put(s.charAt(i),i);
            }
        }
      int min = s.length();
        for(Character key : hp.keySet()){
            if(hp.get(key) < min)
                min = hp.get(key);
        }

        return min==s.length()?-1:min;
    }
}
