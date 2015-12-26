public class Solution {
    public int[][] generateMatrix(int n) {
        int max = n*n;
        int[][] result = new int[n][n];
        int direction = 1;
        int x = 0, y = 0;
        for (int i = 1; i<=max; i++)
        {
            result[x][y] = i;
            if (direction==1)
            {
                if (y+1<n&&result[x][y+1]==0)
                {
                    y++;
                }
                else
                {
                    direction++;
                }
            }
            if (direction==2)
            {
                if (x+1<n&&result[x+1][y]==0)
                {
                    x++;
                }
                else
                {
                    direction++;
                }
            }
            if (direction==3)
            {
                if (y-1>=0&&result[x][y-1]==0)
                {
                    y--;
                }
                else
                {
                    direction++;
                }
            }
            if (direction==4)
            {
                if (x-1>=0&&result[x-1][y]==0)
                {
                    x--;
                }
                else
                {
                    direction = 1;
                    if (y+1<n&&result[x][y+1]==0)
                    {
                        y++;
                    }
                    else
                    {
                        direction++;
                    }
                }
            }
        }
        return result;
    }
}