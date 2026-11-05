class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        ArrayList<Node> ans = new ArrayList<>();
        Node pre = null;
        Node suc = null;
        
        Node curr = root;
        
        while(curr != null){
            if(curr.data < key){
                pre = curr;
                curr = curr.right;
            }
            
            else{
                curr = curr.left;
            }
        }
        curr = root;
        
        while(curr != null){
            if(curr.data > key){
                suc = curr;
                curr = curr.left;
            }
            
            else{
                curr = curr.right;
            }
        }
        
        ans.add(pre);
        ans.add(suc);
        
        return ans;
        
    }
}