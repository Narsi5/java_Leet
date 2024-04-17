import java.util.List;

public class MiddleofListNode {

    public ListNode middleNode(ListNode head) {
        int size =0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp =temp.next;
        }
        int middle = (size/2)+1;
        int count = 0;
        ListNode temp1 = head;
        while(temp1.next != null){
            count++;
            if(count == middle){
                return temp1;
            }
            temp1 = temp1.next;
        }
        return temp1;
    }

}
