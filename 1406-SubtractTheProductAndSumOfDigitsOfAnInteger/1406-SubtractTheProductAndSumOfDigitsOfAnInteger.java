// Last updated: 8/12/2026, 8:50:51 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int d,a,s=0,m=1,res;
        int temp=n;
        while(n!=0){
            d=n%10;
            s+=d;
            n=n/10;
        }
         while(temp!=0){
            a=temp%10;
            m*=a;
            temp=temp/10;
        }
        res=m-s;
        return res;
    }
}