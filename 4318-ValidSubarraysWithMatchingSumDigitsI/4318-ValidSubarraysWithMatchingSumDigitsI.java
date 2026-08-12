// Last updated: 8/12/2026, 8:49:18 AM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        long a=0;
        for(int i=0;i<nums.length;i++){
            long s=0;
            for(int j=i;j<nums.length;j++){
                s+=nums[j];
                long t=s;
                int l=(int) (t%10);
                while(t>=10){
                    t/=10;
                }
                int f=(int)t;
                if(f==x && l==x){
                    a++;
                }
            }
        }
        return (int)a;
    }
}