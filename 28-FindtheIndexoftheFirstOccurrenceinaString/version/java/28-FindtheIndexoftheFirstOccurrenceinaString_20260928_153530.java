// Last updated: 9/28/2026, 3:35:30 PM
1class Solution {
2    public int strStr(String h, String n) {
3        for(int i=0;i<h.length()-n.length()+1;i++){
4            if(h.charAt(i)==n.charAt(0)){
5                if(h.substring(i,n.length()+i) .equals(n))
6                return i;
7            }
8        }
9        return -1;
10    }
11}