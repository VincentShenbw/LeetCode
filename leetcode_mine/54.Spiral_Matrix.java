public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if (matrix==null||matrix.length==0||matrix[0].length==0)
        {
            return result;
        }
        int v = matrix.length, l = matrix[0].length;
        boolean[][] flag = new boolean[v][l]; 
        int direction = 0;
        int i = 0, j = 0;
        result.add(matrix[i][j]);
        flag[i][j] = true;
        int count = 1;
        while (count!=matrix.length*matrix[0].length)
        {
            if (direction==0)
            {
                if (j+1<l&&!flag[i][j+1])
                {
                    j++;
                    flag[i][j] = true;
                    result.add(matrix[i][j]);
                    count++;
                }
                else
                {
                    direction++;
                }
            }
            else if (direction==1)
            {
                if (i+1<v&&!flag[i+1][j])
                {
                    i++;
                    flag[i][j] = true;
                    result.add(matrix[i][j]);
                    count++;
                }
                else
                {
                    direction++;
                }
            }
            else if (direction==2)
            {
                if (j-1>=0&&!flag[i][j-1])
                {
                    j--;
                    flag[i][j] = true;
                    result.add(matrix[i][j]);
                    count++;
                }
                else
                {
                    direction++;
                }
            }
            else
            {
                if (i-1>=0&&!flag[i-1][j])
                {
                    i--;
                    flag[i][j] = true;
                    result.add(matrix[i][j]);
                    count++;
                }
                else
                {
                    direction = 0;
                }
            }
        }
        return result;
    }
}