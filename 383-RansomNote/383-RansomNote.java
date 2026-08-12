// Last updated: 8/12/2026, 9:31:42 PM
class Solution {
    public boolean canConstruct(String ran, String mag) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(char ch:mag.toCharArray()){
            if(m.containsKey(ch)){
                m.put(ch,m.get(ch)+1);
            }
            else
            m.put(ch,1);
        }
        for(char i:ran.toCharArray()){
            if(!m.containsKey(i)){
                return false;
            }
            if(m.get(i)==0){
                return false;
            }
            m.put(i,m.get(i)-1);
            
        }
        return true;
    }
}