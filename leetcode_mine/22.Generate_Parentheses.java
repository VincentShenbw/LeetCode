public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        if (n==0)
        {
            return result;
        }
        dfs(result, "", 0, 0, n);
        return result;
    }
    
    public void dfs(List<String> result, String str, int left, int right, int n)
    {
        if (left<right)
        {
            return;
        }
        if (left==n&&right==n)
        {
            result.add(str);
        }
        if (left<n) dfs(result, str+"(", left+1, right, n);
        if (right<n) dfs(result, str+")", left, right+1, n);
    }
}