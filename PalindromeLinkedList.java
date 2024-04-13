public class PalindromeLinkedList {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
      public ListNode reverse(ListNode head){
          ListNode prev = null;
          ListNode curr = head;
          while(curr != null){
              ListNode front= curr.next;
              curr.next = prev;
              prev= curr;
              curr = front;
          }
          return prev;
      }
      public ListNode findMiddle(ListNode head){
          //hare turtle approch
          ListNode hare = head;
          ListNode turtle = head;
          while(hare.next != null && hare.next.next != null){
              hare = hare.next.next;
              turtle = turtle.next;
          }
          return turtle;
      }
    public boolean isPalindrome(ListNode head) {
        if(head == null|| head.next ==null){
            return true;
        }
        ListNode middle = findMiddle(head);//first half end
        ListNode secondhalfstart = reverse(middle.next);
        ListNode firstHalfstart = head;
        while(secondhalfstart != null){
            if(firstHalfstart.val != secondhalfstart.val){
                return false;
            }
            firstHalfstart= firstHalfstart.next;
            secondhalfstart= secondhalfstart.next;

        }
        return true;

    }

    public static void main(String[] args) {
          PalindromeLinkedList solution = new PalindromeLinkedList();
          ListNode head = solution.new ListNode(1);
          head.next = solution.new ListNode(2);
          head.next.next = solution.new ListNode(3);
          head.next.next.next = solution.new ListNode(2);
          head.next.next.next.next = solution.new ListNode(1);
          System.out.println(solution.isPalindrome(head));
    }
}
