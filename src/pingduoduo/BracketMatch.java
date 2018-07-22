package pingduoduo;

import java.util.Stack;

public class BracketMatch {
    public boolean singleMatch(char[]brackets,int start, int count){
       if(start == brackets.length-1){
           if(brackets[start] == ')'&&count==1)
              return true;
           return false;
       }

       if(brackets[start] == '(')
       {
           count++;
           return singleMatch(brackets,start+1,count);
       }
       else {
           if(count>0){
               count--;
               return singleMatch(brackets,start+1,count);
           }
           else{
               return false;
           }
       }
    }

    public boolean singleMatchWithStack(char[]brackets){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<brackets.length;i++){
            if(brackets[i] == '(')
                stack.push('(');
            else if(brackets[i]==')'){
                if(stack.empty())
                    return false;
                    stack.pop();
            }
        }

        if(stack.empty())
            return true;
        return false;
    }
}
