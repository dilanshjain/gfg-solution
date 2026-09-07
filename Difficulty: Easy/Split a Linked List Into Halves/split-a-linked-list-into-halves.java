class Solution {
    public Pair<Node, Node> splitList(Node head) {
        
       if(head == null){
           return new Pair<>(null , null);
       }
       
       Node slow = head;
       Node fast = head;
       
       while(fast.next != head && fast.next.next != head){
           slow = slow.next;
           fast = fast.next.next;
       }
       
       Node head1 = head;
       Node head2 = slow.next;
       
       if(fast.next.next == head){
           fast = fast.next;
       }
       
       slow.next = head1;
       fast.next = head2;
       
       return new Pair<>(head1 , head2);
       
        
    }
}