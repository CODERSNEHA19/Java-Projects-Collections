class Solution {
    public int trap(int[] height) 
    {
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        int m=height[0],i,sum=0;
        for(i=0;i<height.length;i++)
        {
            if(height[i]>=m)
                m=height[i];
            left[i]=m;
        }
        m=height[height.length-1];
        for(i=height.length-1;i>=0;i--)
        {
            if(height[i]>=m)
                m=height[i];
            right[i]=m;

        }

        for(i=0;i<height.length;i++)
            sum+=Math.min(right[i],left[i])-height[i];

        return sum;
    }
}
