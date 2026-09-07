class Solution {
    Node deleteNode(Node head, int key) {

        if (head == null) return null;

        
        if (head.next == head) {
            if (head.data == key) return null;
            return head;
        }

        Node tail = head;

        while (tail.next != head) {
            tail = tail.next;
        }

        
        if (head.data == key) {
            head = head.next;
            tail.next = head;
            return head;
        }

        Node temp = head;
        Node curr = head.next;

        while (curr != head) {
            if (curr.data == key) {
                temp.next = curr.next;
                return head;
            }

            temp = curr;
            curr = curr.next;
        }

        return head;
    }
}