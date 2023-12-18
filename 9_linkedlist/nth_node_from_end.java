//https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1



/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        //One possible approach is to reverse and find nth from beginning
        
        n--;
        Node curr = head;
        while(n-- > 0 && curr != null){
            curr = curr.next;
        }
        if(curr == null)
            return -1;
        Node n_behind = head;
        while(curr.next != null){
            curr = curr.next;
            n_behind = n_behind.next;
        }
        return n_behind.data;
    }
}