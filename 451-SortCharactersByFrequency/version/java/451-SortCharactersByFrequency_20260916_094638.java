// Last updated: 9/16/2026, 9:46:38 AM
1class Solution {
2    public String frequencySort(String s) {
3       HashMap<Character,Integer> m=new HashMap<>();
4       for(int i=0;i<s.length();i++){
5        char ch =s.charAt(i);
6        if(m.containsKey(ch))
7        m.put(ch,m.get(ch)+1);
8        else
9        m.put(ch,1);
10       } 
11       StringBuilder sb=new StringBuilder();
12       Character[] arr=m.keySet().toArray(new Character[0]);
13       Arrays.sort(arr,(a,b)-> m.get(b)-m.get(a));
14       for(char f:arr){
15        for(int i=0;i<m.get(f);i++){
16            sb.append(f);
17        }
18       }
19       return sb.toString();
20    }
21}