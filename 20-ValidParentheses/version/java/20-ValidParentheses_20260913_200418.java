// Last updated: 9/13/2026, 8:04:18 PM
1class Solution {
2    public boolean isValid(String s) {
3    Stack<Character> st=new Stack<>(); 
4    for(int i=0;i<s.length();i++){
5        char c=s.charAt(i);
6        if(c=='(' || c=='{' || c=='['){
7            st.push(c);
8        }
9       else if(c==')' || c=='}' || c==']'){
10          if(st.isEmpty())
11             return false;
12            if((c==')' && st.peek()=='(') || (c=='}' && st.peek()=='{') || (c==']' && st.peek()=='[')){
13                st.pop();
14            }
15            else 
16            return false;
17          
18        }
19
20    }
21    return st.isEmpty();
22    }
23}