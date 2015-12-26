public class Solution {
    public boolean isValid(String s) {
        boolean result = true;
        Stack<String> stack = new Stack<String>();
        int len = s.length();
        if (len%2==1)
        {
            return false;
        }
        for (int i = 0; i < len; i++)
        {
            String t = String.valueOf(s.charAt(i));
            if (t.equals("(") || t.equals("{") || t.equals("["))
            {
                stack.push(t);
            }
            else if (t.equals(")"))
            {
                if (stack.empty() || !stack.pop().equals("("))
                {
                    result = false;
                    break;
                }
            }
            else if (t.equals("}"))
            {
                if (stack.empty() || !stack.pop().equals("{"))
                {
                    result = false;
                    break;
                }
            }
            else if(t.equals("]"))
            {
                if (stack.empty() || !stack.pop().equals("["))
                {
                    result = false;
                    break;
                }
            }
        }
        if (!stack.empty())
        {
            result = false;
        }
        
        return result;
    }
}