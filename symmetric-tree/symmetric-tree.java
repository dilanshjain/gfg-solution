/* Structure of binary tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        mirror(root.left);
        return isIdentical(root.left , root.right);
    }
    boolean isIdentical(Node p, Node q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.data != q.data) return false;
        if(!isIdentical(p.left , q.left)) return false;
        if(!isIdentical(p.right , q.right)) return false;
        return true;
        
    }
    void mirror(Node root) {
        if(root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}