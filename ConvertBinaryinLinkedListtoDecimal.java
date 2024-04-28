public class ConvertBinaryinLinkedListtoDecimal {
    public static void main(String[] args) {
         ListNode head = new ListNode(1);
         head.next = new ListNode(1);
         head.next.next = new ListNode(0);
         head.next.next.next = new ListNode(0);
        System.out.println(getDecimalValue(head));
    }
    public static int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int decimal = temp.val;
        while(temp.next != null){
            decimal = decimal*2 + temp.next.val;
            temp  = temp.next;
        }
        return decimal;
    }
}
