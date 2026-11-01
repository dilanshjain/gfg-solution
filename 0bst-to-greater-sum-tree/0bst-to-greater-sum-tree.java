class Solution {
    public void inorder(Node root , ArrayList<Node> arr){
        if(root == null) return;
        inorder(root.left , arr);
        arr.add(root);
        inorder(root.right , arr);
    }
    public void transformTree(Node root) {
        ArrayList<Node> arr = new ArrayList<>();
        inorder(root , arr);
        Collections.reverse(arr);
        int sum = 0;
        for(int i = 0 ; i < arr.size() ; i++){
            int val = arr.get(i).data;
            arr.get(i).data = sum;
            sum += val;
        }
        
        
    }
}