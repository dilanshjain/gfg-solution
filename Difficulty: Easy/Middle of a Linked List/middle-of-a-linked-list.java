/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        int length = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        
        Node temp2 = head;
        for(int i = 1 ; i <= length / 2 ; i++){
            temp2 = temp2.next;
        }
        
        return temp2.data;
    }
}