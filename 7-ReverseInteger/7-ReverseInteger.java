// Last updated: 8/12/2026, 9:34:33 PM
class Solution {
    public int reverse(long x) {
        long d,a=0;
        while(x!=0){
            d=x%10;
            a=a*10 +d;
            x=x/10;
        }
            if(a<Integer.MIN_VALUE || a>Integer.MAX_VALUE){
            return 0;
    }
        
        return (int)a;
    }
}