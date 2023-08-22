//https://leetcode.com/problems/minimum-window-substring/description/

class Solution1 {
    public String minWindow(String s, String t) {
       //for edge cases
        if (s == null || t == null) {
            throw new IllegalArgumentException("Input string is null");
        }
        if (s.length() < t.length() || t.length() == 0) {
            return "";
        }
      
        //store unique char and their frequency in hashmap
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
      
         //minStart used to print string
        int start = 0;
        int end = 0;
        int charTLeft = t.length();
        int minStart = 0;
        int minLen = Integer.MAX_VALUE;

        while (end < s.length()) {
            char eChar = s.charAt(end);
            if (map.containsKey(eChar)) {
                int count = map.get(eChar);
                if (count > 0) {
                    charTLeft--;
                }
                map.put(eChar, count - 1);
            }
            end++;

            while (charTLeft == 0) {
              //store on minLength
                if (minLen > end - start) {
                    minLen = end - start;
                    minStart = start;
                }
                char sChar = s.charAt(start);
                if (map.containsKey(sChar)) {
                    int count = map.get(sChar);
                    if (count == 0) {
                        charTLeft++;
                    }
                    map.put(sChar, count + 1);
                }
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
/**
 * Space-optimized Sliding Window using Two Pointers
 *
 * Time Complexity: O(S + T)
 *
 * Space Complexity: O(T)
 *
 * S = length of String s. T = length of String t
 */
