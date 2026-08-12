// Last updated: 8/12/2026, 8:51:08 AM
class Solution {
    public int fib(int n) {
         
        if(n==0)
        return 0;
        else if(n==1)
        return 1;
         int nx=0,n1=1,n2=0,i;
        for(i=2;i<=n;i++){
            n2=nx+n1;
            nx=n1;
            n1=n2;
        }
        return n2;
    }
}