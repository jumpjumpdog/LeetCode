package String;

public class LongestCommonPrefix {
    //以下是自己写的版本
    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE,finalPos=0;

        //数组未空
        if(0==strs.length)
            return "";
        for(int i=0;i<strs.length;i++)
            minLen  = minLen<=strs[i].length()?minLen:strs[i].length();


        for(int i=0;i<minLen;i++){
            char head = strs[0].charAt(i);
            for (String a:strs) {
                if(a.charAt(i)!=head){
                    finalPos = i;
                    return strs[0].substring(0,finalPos);
                }
            }
        }
        return strs[0].substring(0,minLen);
    }

    //使用二分法的版本
    public String longestCommonPrefixWithHalf(String[]strs){
        if(strs==null||0==strs.length)
            return "";
        int minLength = Integer.MAX_VALUE;
        for (String str:strs
             ) {
            minLength = Math.min(minLength,str.length());
        }
        int low = 1;
        int high = minLength;
        while(low<=high){
            int middle = (low+high)/2;
            if(isCommonPrefix(strs,middle))
                low = middle+1;
            else
                high = middle-1;
        }
        return strs[0].substring(0,(low+high)/2);
    }
    private boolean isCommonPrefix(String[]strs, int len){
        String temp = strs[0].substring(len);
        for(int i=1;i<strs.length;i++)
            if(!strs[i].startsWith(temp))
                return false;
        return true;
    }
}
