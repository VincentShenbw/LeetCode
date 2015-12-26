public class Solution {
    public int searchInsert(int[] nums, int target) {
        int pre = -1;
        for (int i = 0; i<nums.length; i++)
        {
            if (nums[i]<target)
            {
                pre = i;
            }
            else if (nums[i]==target)
            {
                return i;
            }
            else
            {
                return pre+1;
            }
        }
        return pre+1;
    }
}