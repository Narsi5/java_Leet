public class removenthnodefromendoflist {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size){
            return head.next;
        }
        int indexTosearch = size - n;
        ListNode temp = head;
        int i = 1;
        while( i < indexTosearch){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
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
        removenthnodefromendoflist solution = new removenthnodefromendoflist();

        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        int n = 2; // Specify the value of n here

        // Output the original list
        System.out.println("Original List:");
        solution.printList(head);

        // Remove the nth node from the end
        head = solution.removeNthFromEnd(head, n);

        // Output the modified list
        System.out.println("List after removing " + n + "th node from the end:");
        solution.printList(head);
    }

}
