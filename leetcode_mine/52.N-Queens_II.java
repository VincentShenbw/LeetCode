public class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        int[] a = new int[n];
        dfs(a, 0);
        return count;
    }
    
    public void dfs(int[] a, int row) {
        if (row==a.length)
        {
            count++;
            return;
        }
        for (int i = 0; i<a.length; i++)
        {
            a[row] = i;
            if (check(a, row))
            {
                dfs(a, row+1);
            }
            a[row] = 0;
        }
    }
    
    public boolean check(int a[], int row) {
        for (int i = 0; i<row; i++)
        {
            if (a[row]==a[i]||Math.abs(a[row]-a[i])==(row-i))
            {
                return false;
            }
        }
        return true;
    }
}