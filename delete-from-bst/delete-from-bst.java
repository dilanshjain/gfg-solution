/* Structure of a Binary Search Tree node
class Node {
	public int data;
	public Node left;
	public Node right;
	
	public Node(int val) {
		data = val;
		left = right = null;
	}
}; */

class Solution {
	public Node delNode(Node root, int key) {
		if (root == null) return null;
		if (root.data > key) {
			root.left = delNode(root.left, key);
		}
		else if (root.data < key) {
			root.right = delNode(root.right, key);
		}
		
		else {
			
			if (root.left == null)
				return root.right;
			if (root.right == null)
				return root.left;
			
			Node succ = root.right;
			
			while (succ.left != null) {
				succ = succ.left;
			}
			
			root.data = succ.data;
			
			root.right = delNode(root.right, succ.data);
		}
		
		return root;
		
	}
}
