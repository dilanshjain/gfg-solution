
class Solution {
    public void findPaths(Node root, int s, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> ans) {
        if (root == null) {
            return;
        }
        
        path.add(root.data);
        s -= root.data;
        if (s == 0) {
            ans.add(new ArrayList<>(path));
        }
        
        findPaths(root.left, s, path, ans);
        findPaths(root.right, s, path, ans);
        path.remove(path.size() - 1);
    }

    public ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        findPaths(root, sum, path, ans);

        return ans;
    }
}
