// Last updated: 8/12/2026, 9:33:02 PM
class Solution {
    int calculate(int a,int b,String sb){
        int ans=0;
        switch(sb){
            case "+" : ans=a+b; break;
             case "-" : ans=b-a; break;
              case "*" : ans=a*b; break;
               case "/" : ans=b/a; break;

        }
        return ans;

    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String sb:tokens){
            if(sb.equals("+")  ||sb.equals("-") || sb.equals("*") || sb.equals("/")){
                int a=st.pop();
                int b=st.pop();
                int ans=calculate(a,b,sb);
                st.push(ans);
            }
            else{
                st.push(Integer.parseInt(sb));
            }
        }
        return st.peek();
    }
}