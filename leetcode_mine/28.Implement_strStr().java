public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack==null||needle==null)
        {
            return -1;
        }
        if (needle.equals(""))
        {
            return 0;
        }
        if (haystack.equals(""))
        {
            return -1;
        }
        int[] next = new int[needle.length()];
        getnext(needle, next);
        int i = 0;
        int j = 0;
        while (i<haystack.length()&&j<needle.length())
        {
            if (j==-1||haystack.charAt(i)==needle.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j = next[j];
            }
        }
        if (j>=needle.length())
            return i-needle.length();
        else
            return -1;
    }
    
    public void getnext(String needle, int[] next) {
        int i = 0;
        next[0] = -1;
        int j = -1;
        while (i<needle.length()-1)
        {
            if (j==-1||needle.charAt(i)==needle.charAt(j))
            {
                ++i;
                ++j;
                if (needle.charAt(i)!=needle.charAt(j))
                {
                    next[i] = j;
                }
                else
                {
                    next[i] = next[j];
                }
            }
            else
            {
                j = next[j];
            }
        }
    }
}