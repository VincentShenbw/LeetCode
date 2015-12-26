public class Solution {
    public void nextPermutation(int[] nums) {
        int start = nums.length-1;
        int replace = start-1;
        for (int i = nums.length-2; i>=0; i--)
        {
            if (nums[i]>=nums[start])
            {
                start = i;
                replace = start-1;
            }
            else
            {
                break;
            }
        }
        if (replace==-1)
        {
            Arrays.sort(nums);
            return;
        }
        for (int i = nums.length-1; i>=start; i--)
        {
            if (nums[i]>nums[replace])
            {
                int tmp = nums[replace];
                nums[replace] = nums[i];
                nums[i] = tmp;
                Arrays.sort(nums, replace+1, nums.length);
                return;
            }
        }
    }
}