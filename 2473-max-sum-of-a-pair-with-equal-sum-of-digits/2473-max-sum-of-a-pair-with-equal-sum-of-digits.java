class Solution {
    public int maximumSum(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       List<Integer> list = new ArrayList<>();
       int ans =-1;
        for(int i = 0; i<nums.length;i++){
            int n = nums[i];
            int sum=0;
            while(n>0){
                int rem = n%10;
                sum+=rem;
                n/=10;
             }
            if(map.containsKey(sum)){
                int max = map.get(sum);
                list.add(Math.max(ans,max+nums[i]));
                map.put(sum,Math.max(max,nums[i]));
              }
            else{
                map.put(sum,nums[i]);
            }  
        }
        // System.out.println(map+" "+list);
         if(list.size()>0)
               return Collections.max(list);
        return -1;
    }
}

