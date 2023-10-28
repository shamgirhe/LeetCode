class Solution {
    public int findClosestNumber(int[] nums) {
            Arrays.sort(nums);
        int ans=0 , val=nums[0];
        for(int i:nums){
            if(i==0) return 0;
            if(i>0){
                ans=i;
                break;
            }
            val=i;
        }
        if(ans==0)return nums[nums.length-1];
        if(Math.abs(val)<ans)return val;
        return ans;
        // int min = Integer.MAX_VALUE;

        // for(int i =0; i<nums.length;i++){
        //     int a = Math.abs(nums[i]);
        //     min = Math.min(a,min);

        // }
        // return min;
    }
}