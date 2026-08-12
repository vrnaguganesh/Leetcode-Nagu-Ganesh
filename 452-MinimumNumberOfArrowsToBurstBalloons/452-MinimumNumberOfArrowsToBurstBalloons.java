// Last updated: 8/12/2026, 8:51:42 AM
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        int c=0;
        long end=Long.MIN_VALUE;
        for(int[] ele:points){
            if(ele[0]<=end){
                continue;
            }
            else{
            c++;
            end=ele[1];
            }
        }
    
        return c;
    }
}