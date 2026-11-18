
class Solution {
    static int totalNodes;

    public boolean isHeap(Node root) {
        totalNodes = size(root);

        return isMaxHeap(root) && isCBT(root, 1);
    }

    private int size(Node root) {
        if (root == null) return 0;

        return 1 + size(root.left) + size(root.right);
    }

    private boolean isCBT(Node root, int idx) {
        if (root == null) return true;

        if (idx > totalNodes) return false;

        return isCBT(root.left, 2 * idx) &&
               isCBT(root.right, 2 * idx + 1);
    }

    private boolean isMaxHeap(Node root) {
        if (root == null) return true;

        int leftval = (root.left != null) ?
                      root.left.data : Integer.MIN_VALUE;

        int rightval = (root.right != null) ?
                       root.right.data : Integer.MIN_VALUE;

        if (root.data < leftval || root.data < rightval)
            return false;

        return isMaxHeap(root.left) &&
               isMaxHeap(root.right);
    }
}
