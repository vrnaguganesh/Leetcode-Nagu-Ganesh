// Last updated: 8/12/2026, 8:50:17 AM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++)
        q.add(i);  //store index
       
        int t=0;
        while(!q.isEmpty()){
            int i=q.poll();
            t++;   //he needs 1 second to buy ticket
            tickets[i]--;
            if(tickets[i]>0){
                q.add(i);
            }
            if(i==k && tickets[i]==0)
                return t;
            
        }
        return t;


    }
}