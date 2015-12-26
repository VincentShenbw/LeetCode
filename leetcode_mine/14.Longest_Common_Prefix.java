public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0)
        {
            return "";
        }
        int len = strs[0].length();
        int mark = 0;
        for (int i = 1; i<strs.length; i++)
        {
            if (strs[i].length()<len)
            {
                len = strs[i].length();
                mark = i;
            }
        }
        boolean[] flags = new boolean[len];
        int maxlen = len;
        int left = 0, right = len-1;
        String str = strs[mark].substring(0);
        while(left<=right) {
            for (int i = 0; i<strs.length; i++)
            {
                if (!str.equals(strs[i].substring(0,len)))
                {
                    flags[right] = true;
                    break;
                }
            }
            if (!flags[right])
            {
                if (len==maxlen||flags[len]==true)
                {
                    break;
                }
                else
                {
                    left = right;
                    right++;
                    while (!flags[right])
                        right++;
                    right = (left+right)/2;
                    len = right+1;
                    str = strs[mark].substring(0, len);
                }
            }
            else
            {
                if (right==left)
                {
                    if (right==0)
                    {
                        return "";
                    }
                }
                right = (right+left)/2;
                len = right+1;
                str = strs[mark].substring(0, len);
            }
        }
        return str;
    }
}