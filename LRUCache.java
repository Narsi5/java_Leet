import java.util.HashMap;

public class LRUCache {
    class Node{
        Node prev;
        Node next;
        int value;
        int key;

        public Node(int value, int key) {
            this.value = value;
            this.key = key;
        }
    }
    Node head;
    Node tail;
    int capacity;
    HashMap<Integer,Node> map = new HashMap<>();
    public LRUCache(int capacity)
    {
        this.capacity= capacity;
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else {
            return -1;
        }
    }
    public void put(int key,int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size() == capacity){
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    private void remove(Node node){
        map.remove(node.value);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void insert(Node node){
        map.put(node.value,node);
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        headNext.prev = node;
        node.next = headNext;
    }
}
