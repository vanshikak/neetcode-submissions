class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for(int n : stones){
            list.add(n);
        }
        while(list.size() > 1){
            Collections.sort(list);
            int cur = list.remove(list.size()-1)- list.remove(list.size()-1);
            if(cur!=0){
                list.add(cur);
            }
        }
        return list.isEmpty() ? 0 : list.get(0);
    }
}
