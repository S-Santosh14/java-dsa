import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(target-nums[i]))
            {
                ans[0]=i;
                ans[1]=h.get(target-nums[i]);
            }
            h.put(nums[i],i);
        }
        return ans;
    }
}