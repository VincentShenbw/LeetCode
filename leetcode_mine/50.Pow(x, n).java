public class Solution {
    public double myPow(double x, int n) {
        if (n==0||x==1)
        {
            return (double)1;
        }
        int zhi;
        if (n<0)
        {
            zhi = 0-n;
        }
        else
        {
            zhi = n;
        }
        double tmp, result;
        if (zhi%2==1)
        {
            tmp = myPow(x, zhi/2);
            result = x*tmp*tmp;
        }
        else
        {
            tmp = myPow(x, zhi/2);
            result = tmp*tmp;
        }
        if (n<0)
        {
            return 1/result;
        }
        else
        {
            return result;
        }
    }
}