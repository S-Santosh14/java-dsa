class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        P(ans,new ArrayList<>(),nums);
        return ans;
    }
    public void P(List<List<Integer>> ans,List<Integer> a,int nums[])
    {
        if(a.size()==nums.length)
        ans.add(new ArrayList<>(a));
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(a.contains(nums[i]))
                continue;
                a.add(nums[i]);
                P(ans,a,nums);
                a.remove(a.size()-1);
            }
        }
    }
}
