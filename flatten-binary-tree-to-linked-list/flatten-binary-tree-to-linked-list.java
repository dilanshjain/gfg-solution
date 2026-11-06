/* Binary Tree Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public static void flatten(Node root) {
        Node curr = root;
        while(curr != null){
            if(curr.left != null){
                Node pred = curr.left;
                while(pred.right != null) pred = pred.right;
                
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
                curr = curr.right;
            }
            
           else curr = curr.right;
        }
    }
}