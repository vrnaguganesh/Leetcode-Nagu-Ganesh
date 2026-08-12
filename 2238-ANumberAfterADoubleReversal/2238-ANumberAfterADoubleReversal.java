// Last updated: 8/12/2026, 8:50:24 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int d,a,r=0,r1=0;
        int temp=num;
        while(num!=0){
            d=num%10;
            r=r*10 +d;
            num/=10;
        }
         while(r!=0){
            a=r%10;
            r1=r1*10 +a;
            r/=10;
        }
        if(r1==temp)
        return true;
        else
        return false;
    }
}