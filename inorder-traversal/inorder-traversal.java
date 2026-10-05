/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        inOrder(root , ans);
        return ans;
    }
    
    public void inOrder(Node root , List<Integer> ans){
      if(root == null) return;
      inOrder(root.left , ans);
      ans.add(root.data);
      inOrder(root.right , ans);
    }
}