/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    void attach(Node root, int key) {
        if(root == null) return;
        if(root.data == key) return;
        if(root.data < key){
            if(root.right == null) root.right = new Node(key);
            else attach(root.right , key);
        }
        
        else{
            if(root.left == null) root.left = new Node(key);
            else attach(root.left , key);
        }
    }
    
    public Node insert(Node root, int key){
        attach(root , key);
        return root;
    }
}
