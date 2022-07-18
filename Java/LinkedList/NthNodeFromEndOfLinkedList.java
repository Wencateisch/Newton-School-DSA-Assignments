/*
// information about the class Node
class Node
{
    int data;
    Node next;
    Node(int d) 
    {
        data = d; 
        next = null;
    }
}
*/
static int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	  Node first = head;
    Node second = head;
    for(int i=0;i<n-1;i++){
        second = second.next;
        if(second == null)
            return -1;
    }
    
    while(second.next != null){
        first = first.next;
        second = second.next;
    }
    
   
    return first.data;
    }

    /*
     Input:
2
9 2
1 2 3 4 5 6 7 8 9
4 5
10 5 100 5

Output:
8
-1

Explanation:
Testcase 1: In the first example, there are 9 nodes in linked list and we need to find 2nd node from end. 2nd node from end os 8.
Testcase 2: In the second example, there are 4 nodes in linked list and we need to find 5th from end. Since 'n' is more than number of nodes in linked list, output is -1.
     */