class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }

         List<String> list = new ArrayList<>(map.keySet());
         Collections.sort(list,(a,b) ->{
             if(map.get(b)==map.get(a))
                return a.compareTo(b);
            return map.get(b)-map.get(a);
         });
         return list.subList(0,k);
        
    }
}