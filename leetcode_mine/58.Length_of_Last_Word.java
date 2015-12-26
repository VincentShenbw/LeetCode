public class Solution {
    public int lengthOfLastWord(String s) {
        if (s==null||s.equals(""))
        {
            return 0;
        }
        int len = s.length()-1;
        int wlen = 0;
        while(len>=0&&s.charAt(len)==' ')
        {
            len--;
        }
        while (len>=0&&s.charAt(len)!=' ') {
            wlen++;
            len--;
        }
        return wlen;
    }
}