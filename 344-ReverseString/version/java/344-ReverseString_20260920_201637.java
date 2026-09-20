// Last updated: 9/20/2026, 8:16:37 PM
1class Solution {
2    public void reverseString(char[] s) {
3        int i=0;
4        int h=s.length-1;
5        while(i<h){
6            char c=s[i];
7            s[i]=s[h];
8            s[h]=c;
9            i++;
10            h--;
11        }
12        for(int j=0;j<s.length;j++){
13            System.out.print(s[j]);
14        }
15    }
16}