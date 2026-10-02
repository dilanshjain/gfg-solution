class Solution {
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        Queue<Integer> q2 = new LinkedList<>();
        int n = q.size();
        for(int i=1 ; i <= n/2 ; i++){
            q2.add(q.remove());
        }
        
        while(q2.size() > 0){
            q.add(q2.remove());
            q.add(q.remove());
        }
        
        return q;
        
    }
}   
