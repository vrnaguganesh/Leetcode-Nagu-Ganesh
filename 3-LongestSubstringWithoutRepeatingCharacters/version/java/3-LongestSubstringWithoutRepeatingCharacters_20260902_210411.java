// Last updated: 9/2/2026, 9:04:11 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashMap<Character,Integer> m=new HashMap<>();
4        int l=0;
5        int co=0;
6        int max=Integer.MAX_VALUE;
7        for(int r=0;r<s.length();r++){
8            char c=s.charAt(r);
9            if(m.containsKey(c)){
10                m.put(c,m.get(c)+1);
11            }
12            else
13            m.put(c,1);
14            while(m.get(c)>1){
15                char le=s.charAt(l);
16                m.put(le,m.get(le)-1);
17                if(m.get(le)==0){
18                    m.remove(le);
19                }
20                l++;
21            }
22            
23            co= Math.max(co,r-l+1);
24        }
25        return co;
26    }
27}