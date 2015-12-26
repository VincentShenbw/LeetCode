public class Solution {
    public int longestValidParentheses(String s) {
        if (s.length()==0)
        {
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        int i = 0;
        while (i<s.length())
        {
            if (s.charAt(i)=='(')
            {
                stack.push(i);
                i++;
            }
            else
            {
                if (!stack.isEmpty()&&s.charAt(stack.peek())=='(')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(i);
                }
                i++;
            }
        }
        if (stack.isEmpty())
        {
            return s.length();
        }
        int tmp = s.length();
        int t;
        while (!stack.isEmpty())
        {
            t = stack.pop();
            result = result<(tmp-t-1)?(tmp-t-1):result;
            tmp = t;
        }
        result = result<tmp?tmp:result;
        return result;
    }
}