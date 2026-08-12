// Last updated: 8/12/2026, 8:51:24 AM
class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character> st=new Stack<>();
       Stack<Character> st1 =new Stack<>();
       for(char ch:s.toCharArray()){
        if(ch=='#'){
            if(!st.isEmpty())
            st.pop();
        }
        else
        st.push(ch);
       }
       for(char c:t.toCharArray()){
        if(c=='#' ){
            if(!st1.isEmpty())
            st1.pop();
        }
        else
        st1.push(c);
       }
    //    StringBuilder sb=new StringBuilder();
    //     StringBuilder sh=new StringBuilder();
    //    for(int i=0;i<st.size()-1;i++){
    //     sb.append(st);
    //    }
    //     for(int i=0;i<s){
    //     sh.append(st1);
    //    }
       if(st.equals(st1)){
        return true;
       }
       else
       return false;
    }
}