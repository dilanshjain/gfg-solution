class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                // First node of each level
                if (i == 0) {
                    ans.add(curr.data);
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }

        return ans;
    }
}