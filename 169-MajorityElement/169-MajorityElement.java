// Last updated: 8/12/2026, 9:32:53 PM
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }
            else
            m.put(i,1);
        }
        int w=0;
        int a=0;
        for(int k:m.keySet()){
            if(m.get(k)>w){
                w=m.get(k);
                a=k;
            }
        }
        return a;

    }
}