public class Solution {
    public List<String> anagrams(String[] strs) {
        List<String> result = new ArrayList<String>();
        if (strs==null||strs.length<=1)
        {
            return result;
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i<strs.length; i++)
        {
            String s = sort(strs[i]);
            if (map.containsKey(s))
            {
                if (map.get(s)!=-1)
                {
                    result.add(strs[map.get(s)]);
                    map.put(s, -1);
                }
                result.add(strs[i]);
            }
            else
            {
                map.put(s, i);
            }
        }
        return result;
    }
    
    public String sort(String s)
    {
        char[] cs = s.toCharArray();
        Arrays.sort(cs);
        return new String(cs);
    }
}