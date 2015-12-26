public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
        for (int i = 0; i < nums.length; i++)
        {
            //map.put(nums[i], i+1);
            if (map.containsKey(nums[i]))
            {
                HashSet<Integer> h = (HashSet<Integer>)map.get(nums[i]);
                h.add(i+1);
            }
            else
            {
                HashSet<Integer> s = new HashSet<Integer>();
                s.add(i+1);
                map.put(nums[i], s);
            }
        }
        for (int i = 0; i < nums.length; i++)
        {
            int j = target-nums[i];
            if (map.containsKey(j))
            {
                HashSet<Integer> a = (HashSet<Integer>)map.get(j);
                Iterator it = a.iterator();
                while(it.hasNext())
                {
                    int z = (Integer)it.next();
                    if (z!=i+1)
                    {
                        result[0] = z>(i+1)?(i+1):z;
                        result[1] = z>(i+1)?z:(i+1);
                    }
                }
            }
        }
        return result;
    }
}