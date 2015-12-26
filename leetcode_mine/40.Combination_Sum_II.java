public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (candidates==null||candidates.length==0)
        {
            return result;
        }
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<Integer>();
        getresult(candidates, target, 0, 0, list, result);
        return result;
    }
    
    public boolean getresult(int[] candidates, int target, int index, int count, List<Integer> list, List<List<Integer>> result) 
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
            if (i>index&&candidates[i]==candidates[i-1])
            {
                continue;
            }
            count+=candidates[i];
            list.add(candidates[i]);
            if (getresult(candidates, target, i+1, count, list, result))
            {
                List<Integer> tmp = new ArrayList<Integer>(list);
                result.add(tmp);
            }
            count-=candidates[i];
            list.remove(list.size()-1);
        }
        return false;
    }
}