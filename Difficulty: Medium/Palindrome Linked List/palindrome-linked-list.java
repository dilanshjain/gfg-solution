

class Solution {
    public boolean isPalindrome(Node head) {
        
        Node temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp != null){
            arr.add(temp.data);
            temp = temp.next;
        }
        
        int i = 0;
        int j = arr.size() -1;
        while(i <= j){
            int a = arr.get(i);
            int b = arr.get(j);
            if(a != b) return false;
            i++;
            j--;
        }
        
        return true;
    }
}
