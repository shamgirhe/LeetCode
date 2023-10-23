class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i =0; i<nums.length; i++){
            while(nums[i]>0){
                int a = nums[i]%10;
                s.push(a);
                nums[i]/=10;
            }
            while(!s.isEmpty()){
                list.add(s.pop());
            }
        }
        int[] arr = new int[list.size()];
        for(int i =0; i<arr.length;i++){
            arr[i]=list.get(i);
        }
       return arr;
    }
}