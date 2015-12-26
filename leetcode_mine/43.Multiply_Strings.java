public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int product[] = new int[len1+len2];
        for (int i = len1-1; i>=0; i--)
        {
            for (int j = len2-1; j>=0; j--)
            {
                int d1 = num1.charAt(i)-'0';
                int d2 = num2.charAt(j)-'0';
                product[i+j+1] += d1*d2;
            }
        }
        int carry = 0;
        for (int i = product.length-1; i>=0; i--)
        {
            int tmp = (product[i]+carry)%10;
            carry = (product[i]+carry)/10;
            product[i] = tmp;
        }
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i<product.length&&product[i]==0)
        {
            i++;
        }
        while (i<product.length)
        {
            str.append(product[i]);
            i++;
        }
        if (str.toString().length()==0)
        {
            return "0";
        }
        else
        {
            return str.toString();
        }
    }
}