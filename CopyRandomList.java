import java.util.HashMap;

public class CopyRandomList {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        //for having a track of random mapping
        HashMap<Node,Node> map = new HashMap<>();
        //creating the duplicate with the start same as head.val
        Node start = new Node(head.val);

        //making the node1 with head.next val and node2 as with head
        Node node1 = head.next;
        Node node2 = start;
        //having the map of original and creating dup
        map.put(head,start);
        while(node1 != null){
            node2.next = new Node(node1.val);//adding link with next val as node1.val
            node2 = node2.next;// moving the node to point to next
            map.put(node1,node2);// updating the map
            node1 = node1.next;
        }
        node1 = head;
        node2 = start;
        while(node2 != null){
            node2.random = map.get(node1.random);
            node2 = node2.next;
            node1 = node1.next;
        }
        return start;
    }
}
