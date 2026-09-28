// Last updated: 9/28/2026, 2:08:34 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String f = strs[0];
5        String l = strs[strs.length-1];
6        String res = "";
7        if(strs.length==0) return "";
8      //  else if(f.charAt(0) != l.charAt(0)) return ""; 
9        for(int i=0;i<f.length();i++){
10            if(f.charAt(i) == l.charAt(i)){
11                res+=f.charAt(i);
12            }
13            else{
14                break;
15            }
16        }
17        return res;
18
19    }
20}