// Last updated: 8/12/2026, 8:49:15 AM
class Solution {
    public double minPrice(int[] p, int[] d) {
        Arrays.sort(p);
        Arrays.sort(d);
        int i=p.length-1;
        int j=d.length-1;
        double t=0;
        while(i>=0){
            if(j>=0){
                t=t+p[i]*(100.0-d[j])/100;
                j--;
            }
            else{
                t=t+p[i];
            }
            i--;
        }
        return t;
    }
}