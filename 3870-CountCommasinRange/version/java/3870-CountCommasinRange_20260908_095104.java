// Last updated: 9/8/2026, 9:51:04 AM
1class Solution {
2    public int countCommas(int n) {
3        int count=0;
4       if(n<1000)
5       return 0;
6
7       else{
8        for(int i=1000;i<=n;i++){
9                count++;
10             
11        }
12       } 
13       return count;
14    }
15}