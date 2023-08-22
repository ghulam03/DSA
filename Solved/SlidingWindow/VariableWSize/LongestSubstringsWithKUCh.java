//https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int i=0,j=0;
        int max=Integer.MIN_VALUE;
        Map<Character,Integer> map=new HashMap<>();
        if(k>s.length()){
            return -1;
        }
        while(j<s.length())
        {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
           // if(map.size()<k)
            //{
            //    j++;
            //}
            if(map.size()==k)
            {
                max=Math.max(max,j-i+1);
              //  j++;
            }
            else if(map.size()>k)
            {
                while(map.size()>k)
                {
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                         if(map.get(s.charAt(i))==0)
                         {
                                map.remove(s.charAt(i));
                         }
                    i++;
                }
             //   j++;
            }
            j++;
        }
        return max;
    }
}
