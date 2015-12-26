public class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int result = 0;
        for (int i = 1; i<len; i++)
        {
            if (chartoint(s.charAt(i-1))>=chartoint(s.charAt(i)))
            {
                result+=chartoint(s.charAt(i-1));
            }
            else
            {
                result-=chartoint(s.charAt(i-1));
            }
        }
        result+=chartoint(s.charAt(len-1));
        return result;
    }
    
    public int chartoint(char c)
    {
        int result;
        switch(c) {
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}