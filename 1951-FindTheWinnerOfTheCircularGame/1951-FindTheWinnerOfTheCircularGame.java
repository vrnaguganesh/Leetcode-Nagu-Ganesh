// Last updated: 8/12/2026, 8:50:21 AM
class Solution {
    public int findTheWinner(int n, int k) {
       Queue<Integer> q=new LinkedList<>();
       for(int i=1;i<=n;i++){
        q.add(i);
       }
       while(q.size()!=1){
        //k=3
        for(int i=0;i<k-1;i++){
            
            q.add(q.poll());
        }
        q.poll();

       }
       return q.peek();
    }
}