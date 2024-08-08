import java.util.Stack;

public class ReverseString {
    public String reverseWords(String s) {
        Stack<String> stk = new Stack<>();
        for(String ss :s.split(" ")){
            if(!ss.isEmpty()){
                stk.push(ss);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stk.isEmpty()){
            if(ans.length() >0){
                ans.append(" ");
            }
            ans.append(stk.pop());
        }

        return ans.toString();
    }
}
