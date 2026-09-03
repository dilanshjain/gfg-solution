class Solution {
    public void reorderList(Node head) {
        if(head == null || head.next == null) return;

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node Second = slow.next;
        slow.next = null;

        Node prev = null;

        while(Second != null){
            Node next = Second.next;
            Second.next = prev;
            prev = Second;
            Second = next;
        }

        Node first = head;
        Second = prev;

        while(Second != null){
            Node temp1 = first.next;
            Node temp2 = Second.next;

            first.next = Second;
            Second.next = temp1;

            first = temp1;
            Second = temp2;
        }
    }
}