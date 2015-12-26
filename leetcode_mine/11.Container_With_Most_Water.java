public class Solution {
    public int maxArea(int[] height) {
        if (height==null||height.length<2)
        {
            return 0;
        }
        int left = 0;
        int right = height.length-1;
        int maxarea = 0;
        while (left<right)
        {
            int h = height[left]<height[right]?height[left]:height[right];
            int d = right-left;
            if (d*h>maxarea)
            {
                maxarea = d*h;
            }
            if (height[left]<height[right])
            {
                left++;
            }
            else if (height[left]==height[right])
            {
                left++;
                right--;
            }
            else
            {
                right--;
            }
        }
        return maxarea;
    }
}