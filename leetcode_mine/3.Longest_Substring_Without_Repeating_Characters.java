public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s==null||s.length()==0)
        {
            return 0;
        }
        if (s.length()==1)
        {
            return 1;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int b = 0;
        map.put(s.charAt(b), b);
        int e = 1;
        int result = 1;
        while (e<s.length())
        {
            char c = s.charAt(e);
            if (map.containsKey(c))
            {
                int tmp = map.get(c);
                if (tmp>=b)
                {
                    result = (e-b)>result?(e-b):result;
                    b = tmp+1;
                }
            }
            map.put(c, e);
            e++;
        }
        result = (e-b)>result?(e-b):result;
        return result;
    }
}