public class Solution {
    public void rotate(int[][] matrix) {
        if (matrix==null||matrix.length==0||matrix[0].length==0)
        {
            return;
        }
        int[][] dup = new int[matrix.length][matrix.length];
        for (int i = 0; i<matrix.length; i++)
        {
            for (int j = 0; j<matrix.length; j++)
            {
                dup[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i<matrix.length; i++)
        {
            for (int j = 0; j<matrix.length; j++)
            {
                matrix[i][j] = dup[matrix.length-1-j][i];
            }
        }
    }
}