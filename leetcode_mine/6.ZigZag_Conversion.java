public class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1)return s;
        int unit = 2*numRows-2;
        int len = s.length();
        int col = (len/unit)*(numRows-1);
        int yu = len%unit;
        if (yu>numRows)
        {
            col = col+1+yu-numRows;
        }
        else
        {
            col = col+1;
        }
        char[][] c = new char[numRows][col];
        int m = 0, n = 0;
        for (int i = 0; i<s.length(); i++)
        {
            c[m][n] = s.charAt(i);
            if (n%(numRows-1)==0)
            {
                if (m==(numRows-1))
                {
                    m--;
                    n++;
                }
                else
                    m++;
            }
            else
            {
                m--;
                n++;
            }
        }
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i<numRows; i++)
        {
            for (int j = 0; j<col; j++)
            {
                if (c[i][j]!=0)
                {
                    ss.append(c[i][j]);
                }
            }
        }
        return ss.toString();
    }
}