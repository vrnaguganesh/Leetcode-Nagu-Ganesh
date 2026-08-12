// Last updated: 8/12/2026, 8:51:30 AM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            
            while(!st.isEmpty()  && temp[i]>temp[st.peek()]){
                ans[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        return ans;
        
            }
}