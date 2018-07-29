package String;

public class StrStr {
    public int strStr(String haystack, String needle){
        int i=0,j=0,end=0;
        if(haystack==null||needle==null)
            return 0;
        end = haystack.length()-needle.length();
        if(end<0)
            return -1;
        for(;i<end;i++)
            if(compare(haystack,needle,i))
                return i;
        return 0;
    }
    private boolean compare(String haystack,String needle,int pos){
        return haystack.substring(pos,pos+needle.length()).equals(needle);
    }
}
