// Last updated: 8/12/2026, 9:32:40 PM
class Solution {
    public boolean isHappy(int n) {
        int d;
        while(n!=1 &&n!=4){  //4 is non happy number
            int a=0;
        while(n>0){
            d=n%10;
            a=a+d*d;
            n=n/10;
        }
        n=a;
        }
        if(n==1)
        return true;
        else
        return false;
        
    }
}