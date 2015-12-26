public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor==0)
        {
            return Integer.MAX_VALUE;
        }
        if ((dividend == Integer.MIN_VALUE) && (divisor == -1)) // Overflow case
            return Integer.MAX_VALUE;
        if (divisor==1)
        {
            return dividend;
        }
        if (divisor==-1)
        {
            return (0-dividend);
        }
        String sdend = dividend<0?String.valueOf(dividend).substring(1):String.valueOf(dividend);
        String ssor = divisor<0?String.valueOf(divisor).substring(1):String.valueOf(divisor);
        long newdivisor = Long.parseLong(ssor);
        String result = "0";
        long sum, smalldend;
        int digit, yudend = 0;
        for (int i = ssor.length()-1; i<sdend.length(); i++)
        {
            if (i==ssor.length()-1)
            {
                smalldend = Long.parseLong(sdend.substring(0, i+1));
            }
            else
            {
                smalldend = Long.parseLong(String.valueOf(yudend)+String.valueOf(sdend.charAt(i)));
            }
            sum = 0;
            digit = 0;
            while (sum<=smalldend)
            {
                sum+=newdivisor;
                digit++;
            }
            result = result+String.valueOf(digit-1);
            sum = sum - newdivisor;
            if (sum==smalldend)
            {
                yudend = 0;
            }
            else
            {
                yudend = (int) (smalldend-sum);
            }
        }
        if (dividend<0&&divisor<0||dividend>=0&&divisor>0)
        {
            return Integer.parseInt(result);
        }
        else
        {
            return (0-Integer.parseInt(result));
        }
    }
}