/*
// information about the class Nodeclass Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
public class ReverseTheLinkedList{
    public static Node ReverseLinkedList(Node head) {
        Node prev = null; 
    Node current = head; 
    Node next = null; 
    while (current != null) { 
    next = current.next; 
    current.next = prev; 
    prev = current; 
    current = next; 
    } 
    head = prev; 
    return head;
    }
    public static void main(String[] args) {
        Node head = 1,2,3,4,5,6;
        ReverseLinkedList(head);

    }
}