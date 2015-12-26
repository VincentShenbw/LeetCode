public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (candidates==null||candidates.length==0)
        {
            return result;
        }
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<Integer>();
        getresult(candidates, result, list, 0, 0, target);
        return result;
    }
    
    public boolean getresult(int[] candidates, List<List<Integer>> result, List<Integer> list, int index, int count, int target) 
    {
        if (count>target)
        {
            return false;
        }
        if (count==target)
        {
            return true;
        }
        for (int i = index; i<candidates.length; i++)
        {
            count += candidates[i];
            list.add(candidates[i]);
            if (getresult(candidates, result, list, i, count, target))
            {
                List<Integer> tmp = new ArrayList<Integer>(list);
                result.add(tmp);
            }
            list.remove(list.size()-1);
            count = count-candidates[i];
        }
        return false;
    }
}