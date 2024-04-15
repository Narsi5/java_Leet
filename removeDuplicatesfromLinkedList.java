public class removeDuplicatesfromLinkedList {
    public class ListNode {
              int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode curr = head;
        while (curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            }
            //condition required for handling null value in last
            if (curr.next != null && curr.val != curr.next.val) {
                curr = curr.next;
            }
        }
        return head;

    }
    private void printList(ListNode head) {
       ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        removeDuplicatesfromLinkedList solution = new removeDuplicatesfromLinkedList();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(2);
        head.next.next.next = solution.new ListNode(3);

        solution.deleteDuplicates(head);
        solution.printList(head);
    }
}
