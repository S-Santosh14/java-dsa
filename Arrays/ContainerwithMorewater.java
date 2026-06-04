class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0,h=n-1;
        int max=0;
        while(l<h)
        {
            int a=Math.min(height[l],height[h])*(h-l);
            max=Math.max(max,a);
            if(height[l]<height[h])
                l++;
            else
                h--;
        }
        return max;
    }
}