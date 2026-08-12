// Last updated: 8/12/2026, 8:51:44 AM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[1]==b[1])? b[0]-a[0] : a[1]-b[1]);
        int c=0;
        int end=Integer.MIN_VALUE;
        for(int[] mov:intervals){
           
            if(mov[0]>=end ){
                end=mov[1];
            }
            else
            c++;
        }
        return c;
    }
}