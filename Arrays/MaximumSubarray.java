class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE,s=0;
        for(int i:nums)
        {
            s+=i;
            ans=Math.max(ans,s);
            s=Math.max(0,s);
        }
        return ans;
    }
}