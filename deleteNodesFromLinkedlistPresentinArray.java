import java.util.HashSet;
import java.util.Set;

public class deleteNodesFromLinkedlistPresentinArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        if (head == null) {
            return head;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next != null) {
            if (numSet.contains(curr.next.val)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }

}
