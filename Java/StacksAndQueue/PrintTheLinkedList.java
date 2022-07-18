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
public static void printList(Node head) {
    Node temp = head;
    int count = 0;
    while(temp != null){
        System.out.print(temp.val+" ");
        temp = temp.next;
        count++;
    } 
    // System.out.println("\n"+count);
}

/*
 Sample input
5
2 4 5 6 7

Sample output
2 4 5 6 7
 */