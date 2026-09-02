// Last updated: 9/2/2026, 9:38:51 AM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> res=new ArrayList<>();
4        int l=0;
5        HashMap<Character,Integer> m=new HashMap<>();
6        HashMap<Character,Integer> hm=new HashMap<>();
7        for(char ch:p.toCharArray()){
8            if(hm.containsKey(ch)){
9                hm.put(ch,hm.get(ch)+1);
10            }
11            else
12            hm.put(ch,1);
13        }
14        char[] g=s.toCharArray();
15        for(int r=0;r<g.length;r++){
16             if(m.containsKey(g[r])){
17                m.put(g[r],m.get(g[r])+1);
18            }
19            else
20            m.put(g[r],1);
21
22            if(r-l+1>p.length()){
23               
24                    m.put(g[l],m.get(g[l])-1);
25                if(m.get(g[l])==0){
26                    m.remove(g[l]);
27                }
28                l++;
29            }
30            if(r-l+1==p.length() && m.equals(hm)){
31                res.add(l);
32            }
33        }
34        return res;
35    }
36}