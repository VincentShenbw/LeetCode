public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits==null||digits.equals(""))
        {
            return result;
        }
        dfs(digits, 0, "", result);
        return result;
    }
    
    public void dfs(String digits, int index, String str, List<String> result) {
        if (index==digits.length())
        {
            result.add(str);
            return;
        }
        char c = digits.charAt(index);
        int i = c-'2';
        char start;
        char end;
        if (i==5)
        {
            start = 'p';
            end = 's';
        }
        else if (i==6)
        {
            start = 't';
            end = 'v';
        }
        else if (i==7)
        {
            start = 'w';
            end = 'z';
        }
        else
        {
            start = (char) (i*3+'a');
            end = (char) (i*3+'a'+2);
        }
        for (char j = start; j<=end; j++)
        {
            dfs(digits, index+1, str+j, result);
        }
    }
}