public class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i<nums.length)
        {
            int tmp = nums[i];
            if (tmp==(i+1))
            {
                i++;
                continue;
            }
            else if (tmp<=0||tmp>nums.length||tmp==nums[tmp-1])
            {
                i++;
                continue;
            }
            else
            {
                nums[i] = nums[tmp-1];
                nums[tmp-1] = tmp;
            }
        }
        for (i = 0; i<nums.length; i++)
        {
            if (nums[i]!=i+1)
            {
                return i+1;
            }
        }
        return nums.length+1;
    }
}