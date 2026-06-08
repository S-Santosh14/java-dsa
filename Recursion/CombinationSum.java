class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Sum(candidates,target,0,0,new ArrayList<>(),ans);
        return ans;
    }
    public void Sum(int a[],int k,int i,int s,List<Integer> l,List<List<Integer>> ans)
    {
      if(s==k)
      {
        ans.add(new ArrayList<>(l));
        return;
      }
      if(s>k || i>=a.length)
        return;
      l.add(a[i]);
      Sum(a,k,i,s+a[i],l,ans);
      l.remove(l.size()-1);
      Sum(a,k,i+1,s,l,ans);
    }
}