// Last updated: 8/12/2026, 8:49:20 AM
class Solution {
    public long maxPairStrength(int[] nums) {
        long m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int a=nums[i];
                int b=nums[j];
                long c=1L*a*b;
                while(b!=0){
                    int t=b;
                    b=a%b;
                    a=t;
                }
                long f=Math.abs(a);
                long s=c/(1L*f*f);
                
                if(s>m){
                    m=s;
                }
            }
        }
        return m;
    }
}