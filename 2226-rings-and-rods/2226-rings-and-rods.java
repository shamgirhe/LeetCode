class Solution {
    public int countPoints(String s) {
        int count =0;
        Map<Character,HashSet<Character> >map =new HashMap<>();
        for(int i=1;i<s.length();i+=2){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),new HashSet<>()));
            Set<Character> set = map.get(s.charAt(i));
            set.add(s.charAt(i-1));
        }
        // System.out.println(map);
        for(HashSet<Character> set : map.values() ){
            if(set.size()==3)count++;
        }
        return count;
        
    }
}