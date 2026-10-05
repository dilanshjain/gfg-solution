/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        postOrder(root , ans);
        
        return ans;
    }
    
    public void postOrder(Node root , List<Integer> ans){
        if(root == null) return;
        
        postOrder(root.left , ans);
        postOrder(root.right , ans);
        ans.add(root.data);
    }
}