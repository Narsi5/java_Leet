import java.util.Stack;

public class MinStack {
    Stack<Integer> stk;
    Stack<Integer> s;
    public MinStack() {
        stk = new Stack<>();
        s = new Stack<>();
    }

    public void push(int val) {
        stk.push(val);
        if(s.isEmpty()){
            s.push(val);
        }else{
            if(val<=s.peek()){
                s.push(val);
            }
        }

    }

    public void pop() {
        if(!stk.isEmpty()){
            int num = stk.pop();
            if(num==s.peek()){
                s.pop();
            }
        }
    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return s.peek();

    }
}
