class Solution {
    public int divide(int dividend, int divisor) {
    //    System.out.println(Math.abs(dividend/divisor));
    //     if(dividend <0 && divisor<0) return Math.abs(dividend/divisor);
    //     return dividend/divisor;
    //System.out.println(Integer.MAX_VALUE+" "+Integer.MIN_VALUE);
          long ans = (long)dividend/divisor;
    if(ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
    else if(ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
    else return (int)ans;
    }
}