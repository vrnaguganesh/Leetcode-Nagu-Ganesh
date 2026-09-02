// Last updated: 9/2/2026, 10:29:39 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3    HashMap<Character,Integer> map=new HashMap<>();
4    int l=0;
5    int count=Integer.MIN_VALUE;
6
7    if(s.length()==0){
8        return 0;
9    }
10
11    for(int i=0;i<s.length();i++){
12        char ch=s.charAt(i);
13
14        map.put(ch,map.getOrDefault(ch,0)+1);
15        
16        while(map.get(ch)>1){
17            char rem=s.charAt(l);
18            
19            map.put(rem,map.get(rem)-1);
20
21            if(map.get(rem)==0){
22                map.remove(rem);
23            }
24            l++;
25        }
26
27        count=Math.max(count,i-l+1);
28    }
29    return count;
30    }
31}