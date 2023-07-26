class Solution {
    public int maxArea(int[] height) {
        

        int start = 0;
        int end = height.length-1;
        int max = Integer.MIN_VALUE;

        while(start<end)
        {
        int min_h = Math.min(height[start], height[end]);
        int width = (end - start);
        max = Math.max(max, min_h*width);
        if(height[start]<height[end])
        {
            start++;
        }
        else{
            end--;
        }
        }
        return max;
        

        

    }
}