// Last updated: 8/12/2026, 9:34:19 PM
class Solution {
    public int divide(int dividend, int divisor) {
        int d=dividend/divisor;
        if(dividend==-2147483648 && divisor==-1) 
        return 2147483647;
      return d;
       
        // if((d<Integer.MIN_VALUE || d>Integer.MAX_VALUE )||(dividend<0 &&divisor<0))
        // return d-1;
        // else 
        // return d;
       
    }
}