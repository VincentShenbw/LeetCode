public class Solution {
    public int myAtoi(String str) {
        if (str==null||str.length()==0)
        {
            return 0;
        }
        int start = 0;
        for (int i = 0; i<str.length(); i++)
        {
            if (str.charAt(i)==' ')
            {
                continue;
            }
            else{
                start = i;
                break;
            }
        }
        int fuhao = 0;
        if (str.charAt(start)=='+')
        {
            start++;
        }
        else if (str.charAt(start)=='-')
        {
            fuhao = 1;
            start++;
        }
        if (str.charAt(start)<'0'||str.charAt(start)>'9')
        {
            return 0;
        }
        long result = 0;
        for (int i = start; i<str.length(); i++)
        {
            if (str.charAt(i)<'0'||str.charAt(i)>'9')
            {
                break;
            }
            else
            {
                result = result*10;
                result += (str.charAt(i)-'0');
                if ((0-result)<Integer.MIN_VALUE||result>Integer.MAX_VALUE)
                {
                    break;
                }
            }
        }
        if (fuhao==1)
        {
            result = 0-result;
        }
        if (result<Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        if (result>Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        return (int)result;
    }
}