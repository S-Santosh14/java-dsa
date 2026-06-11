class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max=0;
        int n=s.length();
        Map<Character,Integer> mp=new HashMap<>();
        while(j<n)
        {
            if(mp.containsKey(s.charAt(j)))
                i=Math.max(i,mp.get(s.charAt(j))+1);
            int len=j-i+1;
            max=Math.max(max,len);
            mp.put(s.charAt(j),j);
            j++;
        }
        return max;
    }
}