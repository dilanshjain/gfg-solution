
class Solution {
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node forward = null;
        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            curr.prev = forward;
            prev = curr;
            curr = forward;
        }
        
        return prev;
    }
}