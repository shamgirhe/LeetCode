class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String,Integer> map = new HashMap<>();
        String[] p = paragraph.toLowerCase().replaceAll("\\W+" , " ").split("\\s+");
        for(String s : p){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s : banned){
            map.remove(s);
        }
       // System.out.println(map);
        int mx=Integer.MIN_VALUE;
        String ans="";
        for(String m : map.keySet()){
            int num=map.get(m);
            if(num>mx){
                  ans=m;
                  mx=num;
            }
        }
        return ans;
    }
}