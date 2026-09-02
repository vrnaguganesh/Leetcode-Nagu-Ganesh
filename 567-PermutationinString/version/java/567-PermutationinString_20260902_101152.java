// Last updated: 9/2/2026, 10:11:52 AM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        HashMap<Character,Integer> m=new HashMap<>();
4        HashMap<Character,Integer> hm=new HashMap<>();
5        int l=0;
6        for(char ch:s1.toCharArray()){
7            if(m.containsKey(ch))
8            m.put(ch,m.get(ch)+1);
9            else
10            m.put(ch,1);
11        }
12        char[] s=s2.toCharArray();
13        for(int r=0;r<s2.length();r++){
14            if(hm.containsKey(s[r]))
15            hm.put(s[r],hm.get(s[r])+1);
16            else
17            hm.put(s[r],1);
18            if(r-l+1>s1.length()){
19                hm.put(s[l],hm.get(s[l])-1);
20
21                if(hm.get(s[l])==0){
22                    hm.remove(s[l]);
23                }
24                l++;
25            }
26            if(hm.equals(m)){
27                return true;
28
29            }
30        }
31        return false;
32    }
33}