/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node deleteMiddleElement(Node head) {
		if(head==null){
            return head;
        }
        if(head.next == null){
            head.val = -1;
            return head;
        }
        if(head.next.next==null){
            head.next = null;
            return head;
        }
        Node fast = head;
        Node slow = head;
        Node firstMiddle = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            firstMiddle = slow;
            slow = slow.next;
        }
        firstMiddle.next = slow.next;
        return head;
    }

    /*
     Sample Input 1:
5
1 2 3 4 5

Sample Output:
1 2 4 5

     */