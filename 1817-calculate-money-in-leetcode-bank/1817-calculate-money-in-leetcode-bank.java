class Solution {
    public int totalMoney(int n) {
        int sum=0,count=1,rs=1,count2=1;
        while(count<=n){
          sum+=rs++;
          if(count%7==0){
            rs=count2+1;
            count2++;
          }
          count++;
        }
        return sum;
    }
}