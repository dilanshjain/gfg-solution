

class Solution {
    public boolean isBST(Node root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean check(Node root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.data <= min || root.data >= max) {
            return false;
        }

        return check(root.left, min, root.data) && check(root.right, root.data, max);
    }
}