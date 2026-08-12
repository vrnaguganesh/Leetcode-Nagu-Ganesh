// Last updated: 8/12/2026, 9:31:48 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1)
        return false;
        while(n%4==0){
            n=n/4;

        }
        if(n==1)
        return true;
        else
        return false;
    }
}