package String;

public class CountAndSay {
    public String countAndSay(int n) {
        String result = "1";

        for(int i=1;i<n;i++){
            //start标记当前并说的开始位置
            int start = 0,index=0;
            StringBuilder sb = new StringBuilder();
            char value = result.charAt(index);
            while(index<result.length()){
                while(++index<result.length()&&result.charAt(index)==value){

                }
                sb.append(index-start);
                sb.append(value);

                if (index >=result.length())
                    break;
                start = index;
                value =result.charAt(index);
            }
            result = sb.toString();
        }
        return result;
    }
}
