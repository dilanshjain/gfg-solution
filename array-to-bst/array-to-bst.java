
class Solution {
    public Node sortedArrayToBST(int[] arr) {
        
        int n = arr.length;
        return convert(arr , 0 , n-1);
    }
    
    public Node convert(int[] arr , int low , int high){
        if(low>high) return null;
        int mid = (low + high) / 2;
        Node root = new Node(arr[mid]);
        root.left = convert(arr , low , mid-1);
        root.right = convert(arr , mid + 1 , high);
        return root;
    }
}