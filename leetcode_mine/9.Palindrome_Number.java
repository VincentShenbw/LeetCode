public class Solution {
    public boolean isPalindrome(int x) {
        if (x<0)
        {
            return false;
        }
        if (x<10)
        {
            return true;
        }
        int i = x/10;
        int count = 1;
        while(i!=0){
            count++;
            i = i/10;
        }
        int l, r;
        if (count%2==0)
        {
            l = count/2+1;
            r = count/2;
        }
        else
        {
            l = count/2+2;
            r = count/2;
        }
        int b, e;
        while (l<=count&&r>=1) {
            b = x/(int)Math.pow(10,l-1);
            b = b%10;
            e = x%(int)Math.pow(10,r);
            e = e/(int)Math.pow(10,r-1);
            if (b!=e){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}