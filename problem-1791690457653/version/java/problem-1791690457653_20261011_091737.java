// Last updated: 10/11/2026, 9:17:37 AM
1class Solution {
2    public boolean threeFibonacciSum(int n) {
3        int a=0,b=1,c=1;
4        while(a+b+c<=n){
5            if(a+b+c==n){
6                return true;
7            }
8            int d=b+c;
9            a=b;
10            b=c;
11            c=d;
12        }
13        return false;
14    }
15}