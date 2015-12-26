public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length==0)
        {
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        int mid;
        while (left<=right)
        {
            if (nums[left]<=nums[right])
            {
                if (target<nums[left]||target>nums[right])
                {
                    return -1;
                }
                else
                {
                    if ((right-left)<=1)
                    {
                        if (nums[left]==target)
                        {
                            return left;
                        }
                        else if (nums[right]==target)
                        {
                            return right;
                        }
                        else{
                            return -1;
                        }
                    }
                    mid = (left+right)/2;
                    if (nums[mid]>target)
                    {
                        right = mid;
                    }
                    else if (nums[mid]==target)
                    {
                        return mid;
                    }
                    else
                    {
                        left = mid;
                    }
                }
            }
            else
            {
                mid = (left+right)/2;
                if (nums[mid]>nums[left])
                {
                    if (nums[mid]>=target&&nums[left]<=target)
                    {
                        right = mid;
                    }
                    else if (nums[mid]<target||nums[right]>=target)
                    {
                        left = mid;
                    }
                    else
                    {
                        return -1;
                    }
                }
                else if (nums[mid]==nums[left])
                {
                    if (nums[left]==target)
                    {
                        return left;
                    }
                    else if (nums[right]==target)
                    {
                        return right;
                    }
                    else{
                        return -1;
                    }
                }
                else
                {
                    if (nums[mid]<=target&&nums[right]>=target)
                    {
                        left = mid;
                    }
                    else if (nums[mid]>target||nums[left]<=target)
                    {
                        right = mid;
                    }
                    else
                    {
                        return -1;
                    }
                }
            }
        }
        return -1;
    }
}