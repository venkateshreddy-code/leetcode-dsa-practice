import java.util.ArrayList;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> mp =new HashMap<>();
        for(String str:strs){
            char[] hash = new char[26];
            for(char ch:str.toCharArray()){
                
                hash[ch - 'a']++;
            }
            String r = new String(hash);
            if(!mp.containsKey(r)){
                mp.put(r,new ArrayList<>());
            }
            mp.get(r).add(str);
        }
        for(String key:mp.keySet()){
            res.add(mp.get(key));
        }
        return res;
    }
}
