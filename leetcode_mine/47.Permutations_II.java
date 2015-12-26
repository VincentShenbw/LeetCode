public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums==null||nums.length==0)
        {
            return result;
        }
        List<Integer> list = new LinkedList<Integer>();
        list.add(nums[0]);
        getresult(result, list, nums, 1);
        return result;
    }
    
    public void getresult(List<List<Integer>> result, List<Integer> list, int[] nums, int index)
    {
        if (index>=nums.length)
        {
            List<Integer> tmp = new LinkedList<Integer>(list);
            result.add(tmp);
            return;
        }
        for (int i = 0; i<=list.size(); i++)
        {
            list.add(i, nums[index]);
            getresult(result, list, nums, index+1);
            list.remove(i);
            if (i!=list.size()&&nums[index]==list.get(i))
            {
                break;
            }
        }
    }
}