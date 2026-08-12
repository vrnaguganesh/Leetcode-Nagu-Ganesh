// Last updated: 8/12/2026, 9:32:19 PM
import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(char i:s.toCharArray()){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }
        HashMap<Character,Integer> ma=new HashMap<>();
        for(char v:t.toCharArray()){
            if(ma.containsKey(v)){
                ma.put(v,ma.get(v)+1);
            }
            else{
                ma.put(v,1);
            }
        }
        if(m.equals(ma)){
            return true;
        }
        else
        return false;
    }
}