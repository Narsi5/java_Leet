import java.util.ArrayList;
import java.util.Collections;
public class SortList {
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp!=null ){
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(arr);
        ListNode t = head;
        int i = 0;
        while(i<arr.size()&&t!=null){
            t.val = arr.get(i);
            i++;
            t = t.next;
        }
        return head;
    }
}
