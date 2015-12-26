public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length<=2)
        {
            return result;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i<nums.length; i++)
        {
            if (!map.containsKey(nums[i]))
            {
                map.put(nums[i], 1);
            }
            else
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        Arrays.sort(nums);
        int first = 0;
        int second = first+1;
        for (first = 0; first<nums.length-2&&nums[first]<=0; first++)
        {
            if (first>0&&nums[first]==nums[first-1])
            {
                continue;
            }
            for (second = first+1; second<nums.length-1; second++)
            {
                if (second>first+1&&nums[second]==nums[second-1])
                {
                    continue;
                }
                int tmp = 0-nums[first]-nums[second];
                boolean flag = false;
                if (tmp>=nums[second])
                {
                    if (tmp==nums[second]&&nums[second]==nums[first])
                    {
                        if (map.get(tmp)>=3)
                        {
                            flag = true;
                        }
                    }
                    else if (tmp==nums[second])
                    {
                        if (map.get(tmp)>=2)
                        {
                            flag = true;
                        }
                    }
                    else
                    {
                        if (map.containsKey(tmp))
                        {
                            flag = true;
                        }
                    }
                    if (flag)
                    {
                        List<Integer> resultone = new ArrayList<Integer>();
                        resultone.add(nums[first]);
                        resultone.add(nums[second]);
                        resultone.add(tmp);
                        result.add(resultone);
                    }
                }
            }
        }
        return result;
    }
}