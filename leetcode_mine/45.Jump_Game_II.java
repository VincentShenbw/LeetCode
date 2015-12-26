public class Solution {
    public int jump(int[] nums) {
        if (nums.length<=1)
        {
            return 0;
        }
        int i = 0, curmax = 0, result = 0;
        while (curmax<nums.length-1)
        {
            int lastcur = curmax;
            for (; i<=lastcur;i++)
            {
                curmax = Math.max(curmax, i+nums[i]);
            }
            result++;
            if (lastcur==curmax)
            {
                return -1;
            }
        }
        return result;
    }
}