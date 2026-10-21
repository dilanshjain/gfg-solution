
class Solution {
    int idx = 0;

    Node preToBST(int[] pre) {
        idx = 0;
        return build(pre, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    Node build(int[] pre, int low, int high) {
        if (idx >= pre.length) return null;

        int val = pre[idx];

        if (val <= low || val >= high) {
            return null;
        }

        Node root = new Node(val);
        idx++;

        root.left = build(pre, low, val);
        root.right = build(pre, val, high);

        return root;
    }
}
