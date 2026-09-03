class Solution {
    Node mergeKLists(Node[] arr) {
        
        ArrayList<Node> list = new ArrayList<>();
        for(Node node : arr){
            list.add(node);
        }
        
        
        while(list.size() > 1){
            Node a = list.get(list.size()-1);
            list.remove(list.size()-1);
            
            Node b = list.get(list.size()-1);
            list.remove(list.size()-1);
            
            Node c = merge(a , b);
            
            list.add(c);
        }
        
        return list.get(0);
    }
    
    Node merge(Node head1 , Node head2){
        Node i = head1;
        Node j = head2;
        Node dummy = new Node(-1);
        Node k = dummy;
        
        while(i != null && j != null){
            if(i.data <= j.data){
                k.next = i;
                i = i.next;
            }
            
            else{
                k.next = j;
                j = j.next;
            }
            
            k = k.next;
        }
        
        if(i == null) k.next = j;
        else k.next = i;
        return dummy.next;
        
    }
}