class Solution {
    public int[] numberOfPairs(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
        int count=0;
       for(int i =0; i<nums.length;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);

           if(map.containsKey(nums[i])){
               if(map.get(nums[i])==2){
                   count++;
                   map.remove(nums[i]);
               }
            }
       } 
       return new int[]{count,map.size()};
    }
}