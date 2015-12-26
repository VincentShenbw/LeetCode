public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int index = 0;
        for (int i = 0; i<nums.length; i++)
        {
            if (nums[i]==val)
            {
                len--;
                continue;
            }
            else {
                nums[index] = nums[i];
                index++;
            }
        }
        return len;
    }
}