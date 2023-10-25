class Solution {
    public String longestDiverseString(int a, int b, int c) {
      StringBuilder sb = new StringBuilder();
      
      int counta=0,countb=0,countc=0;
      int total= a+b+c;

      for(int i=0;i<total;i++){
          if((a>=b && a>=c && counta!=2) || (countb==2 && a>0) ||(countc==2 && a>0)){
              sb.append("a");
              a--;
              counta++;
              countb=0;
              countc=0;
             }
           else if((b>=a && b>=c && countb!=2) || (counta==2 && b>0) ||(countc==2 && b>0)){
              sb.append("b");
              b--;
              countb++;
              counta=0;
              countc=0;
          }
          else if((c>=b && c>=a && countc!=2) || (countb==2 && c>0) ||(counta==2 && c>0)){
              sb.append("c");
              c--;
              countc++;
              countb=0;
              counta=0;
          }  
      }
        return sb.toString();
    }
}