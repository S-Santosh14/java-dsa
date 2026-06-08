class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums,target,0,0);
    }
    public int backtrack(int a[],int k,int idx,int sum)
    {
        if(idx==a.length)
            return sum==k?1:0;
        return backtrack(a,k,idx+1,sum+a[idx])+backtrack(a,k,idx+1,sum-a[idx]);
    }
}