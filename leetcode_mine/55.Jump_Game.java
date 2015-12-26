public class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        int max = 0;
        while (i<=max)
        {
            if (i+nums[i]>max)
            {
                max = i+nums[i];
            }
            if (max>=nums.length-1)
            {
                return true;
            }
            i++;
        }
        return false;
    }
}