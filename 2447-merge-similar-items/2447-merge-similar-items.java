class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
       
       Map<Integer, Integer> map = new TreeMap<>();
       List<List<Integer>> list = new ArrayList<>();
       
       for(int i =0; i<items1.length;i++)
            map.put(items1[i][0],items1[i][1]);
       

       for(int i=0; i<items2.length;i++){
           if(map.containsKey(items2[i][0]))
                map.put(items2[i][0], map.get(items2[i][0])+items2[i][1]);
           
            else
                map.put(items2[i][0] , items2[i][1]);
       }
    
         for(int i : map.keySet()){
             List<Integer> list2 = new ArrayList<>();
             list2.add(i);
             list2.add(map.get(i));
             list.add(list2);
         }
        
        return list;
    }
}