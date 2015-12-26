public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        int count = 0;
        while (n>1)
        {
            StringBuilder ss = new StringBuilder();
            count = 1;
            char pre = s.charAt(0);
            for (int i = 1; i<s.length(); i++)
            {
                if (s.charAt(i)==pre)
                {
                    count++;
                }
                else
                {
                    ss.append(count);
                    ss.append(pre);
                    pre = s.charAt(i);
                    count = 1;
                }
            }
            ss.append(count);
            ss.append(pre);
            s = ss.toString();
            n--;
        }
        return s;
    }
}