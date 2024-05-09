import java.util.Queue;
import java.util.LinkedList;
public class stackusingqueue {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int top;
    public void MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.offer(x);
        top =x;
    }

    public int pop() {
        while(q1.size() > 1) {
            top = q1.poll();
            q2.offer(top);
        }

        int ans = q1.poll();

        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
        return ans;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
