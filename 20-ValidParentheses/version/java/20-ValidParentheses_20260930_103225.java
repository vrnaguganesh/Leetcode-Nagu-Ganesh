// Last updated: 9/30/2026, 10:32:25 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(ch=='{' || ch=='[' || ch=='('){
7                st.push(ch);
8            }
9            else if(!st.isEmpty() && ((ch==')' && st.peek()=='(')  ||  (ch=='}' && st.peek()=='{')  ||  (ch==']' && st.peek()=='['))){
10                st.pop();
11            }
12            else return false;
13        }
14        if(st.isEmpty()){
15            return true;
16        }
17        else
18        return false;
19    }
20}