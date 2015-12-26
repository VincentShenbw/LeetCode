public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums==null||nums.length==0)
        {
            return 0;
        }
        if (nums.length==1)
        {
            return 1;
        }
        int count = nums.length;
        int pre = nums[0];
        int index = 1;
        for (int i = 1; i<nums.length; i++)
        {
            if (pre==nums[i])
            {
                count--;
            }
            else
            {
                pre = nums[i];
                nums[index] = nums[i];
                index++;
            }
        }
        return count;
    }
}