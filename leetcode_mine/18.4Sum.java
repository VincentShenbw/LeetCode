public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        int first, second, third, last, sum;
        for (int i = 0; i<nums.length-3; i++)
        {
            if (i>0&&nums[i]==nums[i-1])
            {
                continue;
            }
            first = nums[i];
            for (int j = i+1; j<nums.length-2; j++)
            {
                if (j>(i+1)&&nums[j]==nums[j-1])
                {
                    continue;
                }
                second = nums[j];
                third = j+1;
                last = nums.length-1;
                while (third<last){
                    if (third>(j+1)&&nums[third]==nums[third-1])
                    {
                        third++;
                        continue;
                    }
                    sum = first+second+nums[third]+nums[last];
                    if (sum==target)
                    {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(first);
                        list.add(second);
                        list.add(nums[third]);
                        list.add(nums[last]);
                        result.add(list);
                        third++;
                        last--;
                    }
                    else if (sum<target)
                    {
                        third++;
                    }
                    else
                    {
                        last--;
                    }
                }
            }
        }
        return result;
    }
}