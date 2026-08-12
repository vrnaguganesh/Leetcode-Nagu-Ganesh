// Last updated: 8/12/2026, 8:49:13 AM
class Solution {
    public int maxDistance(String moves) {
        int l=0,r=0,u=0,d=0,k=0;
        for(char i:moves.toCharArray()){
            if(i=='L')l++;
            else if(i=='R') r++;
            else if(i=='U') u++;
            else if(i=='D') d++;
            else k++;
        }
        return Math.abs(r-l) +Math.abs(u-d)+k;
    }
}