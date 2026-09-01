/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node t1 = d1;
        Node t2 = d2;
        Node temp = head;
        
        while(temp != null){
            if(temp.data % 2 == 0){
                t1.next = temp;
                t1 = t1.next;
            }
            
            else{
                t2.next = temp;
                t2 = t2.next;
            }
            
            temp = temp.next;
        }
        
        t1.next = d2.next;
        t2.next = null;
        
        return d1.next;
        
        
    }
}