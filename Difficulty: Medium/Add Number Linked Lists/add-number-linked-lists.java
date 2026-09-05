class Solution {

    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    Node addTwoLists(Node num1, Node num2) {

        num1 = reverse(num1);
        num2 = reverse(num2);

        Node dummy = new Node(0);
        Node curr = dummy;

        int carry = 0;

        while (num1 != null || num2 != null || carry != 0) {

            int sum = carry;

            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }

            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }

            carry = sum / 10;

            curr.next = new Node(sum % 10);
            curr = curr.next;
        }

        Node result = reverse(dummy.next);

        while (result.data == 0 && result.next != null) {
            result = result.next;
        }

        return result;
    }
}