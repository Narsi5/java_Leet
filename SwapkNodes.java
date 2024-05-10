public class SwapkNodes {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode startNode = dummy;
        while (startNode != null) {
            startNode = reverseKNodes(startNode, k);
        }
        return dummy.next;
    }
    public ListNode reverseKNodes(ListNode startNode, int k) {
        int i = 0;
        ListNode head = startNode.next;
        ListNode previous = head;
        ListNode current = head;
        ListNode front = null;
        while (i < k) {
            if (previous == null) return null;
            previous = previous.next;
            i++;
        }
        for (int j = 0; j < k; j++) {
            front = current.next;
            current.next = previous;
            previous = current;
            current = front;
        }
        startNode.next = previous;
        return head;
    }
}
