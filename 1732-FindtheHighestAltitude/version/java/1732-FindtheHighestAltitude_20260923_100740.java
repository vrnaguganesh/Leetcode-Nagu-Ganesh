// Last updated: 9/23/2026, 10:07:40 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int[] p=new int[gain.length+1];
4        p[0]=0;
5        for(int i=1;i<p.length;i++){
6            p[i]=p[i-1]+gain[i-1];
7        }
8        int m=Integer.MIN_VALUE;
9        for(int j=0;j<p.length;j++){
10            m=Math.max(m,p[j]);
11        }
12        return m;
13    }
14}