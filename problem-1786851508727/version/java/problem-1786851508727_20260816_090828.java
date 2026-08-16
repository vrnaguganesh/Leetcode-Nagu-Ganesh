// Last updated: 8/16/2026, 9:08:28 AM
1class Solution {
2    public int nearestDrone(int[][] d, int[] t) {
3        int a=-1;
4        int m=Integer.MAX_VALUE;
5        for(int i=0;i<d.length;i++){
6            int f=Math.abs(d[i][0]-t[0])+Math.abs(d[i][1]-t[1]);
7            if(f<= d[i][2] && f<m){
8                m=f;
9                a=i;
10            }
11        }
12        return a;
13    }
14}