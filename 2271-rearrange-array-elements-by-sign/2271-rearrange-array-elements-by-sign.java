class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr1 = new int[nums.length/2];
        int[] arr2 = new int[nums.length/2];
        int[] arr = new int[nums.length];
       int count=0;
       for(int i=0; i<nums.length;i++){
           if(nums[i]<0){
               arr1[count]=nums[i];
               count++;
           }
       }
           count=0;
        for(int i=0; i<nums.length;i++){
           if(nums[i]>0){
               arr2[count]=nums[i];
               count++;
           }
        }  
        count=0;
        int c=0;
        boolean flag =true;
        for(int i=0; i<nums.length;i++){
            if(flag){ 
              arr[i]=arr2[count];
                flag=false;
                count++;
             }
            else{
                arr[i]=arr1[c];
                    flag=true;
                    c++;
            }
              
        }      
       return arr;
    }
}