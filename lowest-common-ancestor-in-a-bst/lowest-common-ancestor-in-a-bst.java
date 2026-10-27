/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public Node findLCA(Node root, Node p, Node q) {
        if(root.data > p.data && root.data > q.data) return findLCA(root.left , p , q);
        else if(root.data < p.data &&  root.data < q.data) return findLCA(root.right , p , q);
        else return root;
        
    }
}