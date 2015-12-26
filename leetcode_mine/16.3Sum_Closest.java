public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left, right, result = nums[0]+nums[1]+nums[2];
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i<nums.length-2; i++)
        {
            int tmp = target-nums[i];
            left = i+1;
            right = nums.length-1;
            while (left<right)
            {
                int plus = nums[left]+nums[right];
                if (Math.abs(plus-tmp)<diff)
                {
                    diff = Math.abs(plus-tmp);
                    result = plus+nums[i];
                }
                if (plus<tmp)
                {
                    left++;
                }
                else if (plus==tmp)
                {
                    break;
                }
                else
                {
                    right--;
                }
            }
        }
        return result;
    }
}