class Solution {
    public void printList(Node head) {
        System.out.print(head.data+" ");
        Node temp = head.next;
        while(temp != head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        
    }
}