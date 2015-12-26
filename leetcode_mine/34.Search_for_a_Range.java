public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums==null||nums.length==0)
        {
            return new int[]{-1, -1};
        }
        int left = 0;
        int right = nums.length-1;
        int start = -1, end = -1;
        int mid;
        while (left<=right)
        {
            mid = (left+right)/2;
            if (nums[mid]<target)
            {
                left = mid+1;
            }
            else if (nums[mid]==target)
            {
                start = mid;
                end = mid;
                start = search(nums, target, left, mid-1, start, end);
                end = search(nums, target, mid+1, right, start, end);
                break;
            }
            else
            {
                right = mid-1;
            }
        }
        return new int[]{start, end};
    }
    
    public int search(int[] nums, int target, int left, int right, int start, int end)
    {
        int mid;
        while (left<=right)
        {
            mid = (left+right)/2;
            if (nums[mid]<target)
            {
                left = mid+1;
            }
            else if (nums[mid]==target)
            {
                if (start>right)
                {
                    start = mid;
                    right = mid-1;
                }
                else
                {
                    end = mid;
                    left = mid+1;
                }
            }
            else
            {
                right = mid-1;
            }
        }
        if (start>right)
        {
            return start;
        }
        else
        {
            return end;
        }
    }
}