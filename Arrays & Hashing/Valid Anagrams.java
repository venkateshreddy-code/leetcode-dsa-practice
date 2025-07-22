class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            
            return false;
        }
        int[] chars = new int[26];
        for(int i=0;i<s.length();i++){
            chars[s.charAt(i) - 'a']++;// Increment count for the current character
    // Explanation for each character in "animal":
    // 'a' → index 0  → chars[0]++  → now chars[0] = 1
    // 'n' → index 13 → chars[13]++ → now chars[13] = 1
    // 'i' → index 8  → chars[8]++  → now chars[8] = 1
    // 'm' → index 12 → chars[12]++ → now chars[12] = 1
    // 'a' → index 0  → chars[0]++  → now chars[0] = 2
    // 'l' → index 11 → chars[11]++ → now chars[11] = 1
            chars[t.charAt(i) - 'a']--;
        }
        for(int n:chars){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
