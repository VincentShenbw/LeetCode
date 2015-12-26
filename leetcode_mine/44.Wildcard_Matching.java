public class Solution {
    public boolean isMatch(String s, String p) {
        if (s==null||p==null)
        {
            return false;
        }
        if (p.length()==0)
        {
            if (s.length()==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        boolean flag[][] = new boolean[s.length()+1][p.length()+1];
        flag[0][0] = true;
        for (int i = 1; i<=p.length(); i++)
        {
            if (p.charAt(i-1)=='*')
            {
                flag[0][i] = true;
            }
            else
            {
                break;
            }
        }
        for (int i = 1; i<=s.length(); i++)
        {
            for (int j = 1; j<=p.length(); j++)
            {
                if (p.charAt(j-1)=='*')
                {
                    flag[i][j] = flag[i-1][j-1]||flag[i-1][j]||flag[i][j-1];
                }
                else
                {
                    if (p.charAt(j-1)=='?')
                    {
                        flag[i][j] = flag[i-1][j-1];
                    }
                    else
                    {
                        flag[i][j] = flag[i-1][j-1]&&(s.charAt(i-1)==p.charAt(j-1));
                    }
                }
            }
        }
        return flag[s.length()][p.length()];
    }
}