class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        if(s.length() != t.length()){
            return false;
        }
        for(char c : s1){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c : t1){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        return map.equals(map1);
    }
}
