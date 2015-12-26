public class Solution {
    public int reverse(int x) {
        if (x>-10&&x<10)return x;
        String s = String.valueOf(x);
        StringBuilder ss = new StringBuilder();
        if (s.charAt(0)=='-')
        {
            ss.append('-');
            for (int i = s.length()-1; i>0; i--)
            {
                if (s.charAt(i)=='0'&&ss.length()==1)
                {
                	continue;
                }
            	ss.append(s.charAt(i));
            }
        }
        else {
            for (int i = s.length()-1; i>=0; i--)
            {
            	if (s.charAt(i)=='0'&&ss.length()==0)
                {
                	continue;
                }
            	ss.append(s.charAt(i));
            }
        }
        long l = Long.parseLong(ss.toString());
        if (l>Integer.MAX_VALUE||l<Integer.MIN_VALUE)
        {
            return 0;
        }
        else{
            return Integer.parseInt(ss.toString());
        }
    }
}