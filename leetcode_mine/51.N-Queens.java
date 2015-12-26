public class Solution {
    List<List<String>> result;
    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<List<String>>();
        int a[] = new int[n];
        int i = 0;
        dfs(a, 0);
        return result;
    }
    
    public void dfs(int[] a, int row) {
        if (row==a.length)
        {
            result.add(getOneOfResult(a));
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
    
    public List<String> getOneOfResult(int[] a) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i<a.length; i++)
        {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j<a.length; j++)
            {
                if (a[i]==j)
                {
                    s.append("Q");
                }
                else
                {
                    s.append(".");
                }
            }
            result.add(s.toString());
        }
        return result;
    }
    
    public boolean check(int[] a, int index)
    {
        for (int i = 0; i<index; i++)
        {
            if (a[i]==a[index]||Math.abs(a[index]-a[i])==(index-i))
            {
                return false;
            }
        }
        return true;
    }
}