class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        C(ans,new ArrayList<>(),n,k,1);
        return ans;
    }
    public void C(List<List<Integer>> ans, List<Integer> a,int n,int k,int i)
    {
        if(a.size()==k)
        {
            ans.add(new ArrayList<>(a));
            return;
        }
        for(int j=i;j<=n;j++)
        {
            a.add(j);
            C(ans,a,n,k,j+1);
            a.remove(a.size()-1);
        }
    }
}