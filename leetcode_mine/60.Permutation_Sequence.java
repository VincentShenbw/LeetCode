public class Solution {
    public String getPermutation(int n, int k) {
        boolean[] flag = new boolean[n+1];
        int bits = n;
        int b, index;
        int count = 1;
        String result = "";
        for (int i = 1; i<=bits; i++)
        {
            count = count*i;
        }
        while (k!=1)
        {
            count = count/bits;
            bits--;
            b = k/count;
            k = k%count;
            index = 0;
            if (k==0)
            {
                int j;
            	for (j = 1; j<=n; j++)
                {
                	if (!flag[j])
                		index++;
                	if (index==b)
                	{
                		break;
                	}
                }
            	result = result+String.valueOf(j);
                flag[j] = true;
                break;
            }
            else
            {
            	int j;
            	for (j = 1; j<=n; j++)
                {
                	if (!flag[j])
                		index++;
                	if (index==(b+1))
                	{
                		break;
                	}
                }
            	result = result+String.valueOf(j);
                flag[j] = true;
            }
        }
        if (k==0)
        {
            for (int i = n; i>=1; i--)
            {
                if (!flag[i])
                    result = result+String.valueOf(i);
            }
        }
        else
        {
            for (int i = 1; i<=n; i++)
            {
                if (!flag[i])
                    result = result+String.valueOf(i);
            }
        }
        return result;
    }
}