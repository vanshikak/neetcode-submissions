class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(char c : s1){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for(char c : t1){
            map2.put(c, map2.getOrDefault(c,0)+1);
        }

        if(map1.equals(map2)) return true;

        return false;
    }
}
