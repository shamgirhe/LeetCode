class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
              map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            if (map.getOrDefault(ch, 0)- 1 < 0) {
                return ch; 
            }
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        return ' ';
    }
}