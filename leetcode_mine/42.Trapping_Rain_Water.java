public class Solution {
    public int trap(int[] height) {
        int len = height.length;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        int area = 0;
        for (int i = 1; i<len; i++)
        {
            if (height[i]<height[stack.peek()])
            {
                stack.push(i);
            }
            else
            {
                while (!stack.isEmpty())
                {
                    int tmp = stack.pop();
                    if (stack.isEmpty())
                    {
                        stack.push(i);
                        break;
                    }
                    else
                    {
                        if (height[i]>=height[stack.peek()])
                        {
                            area+=(height[stack.peek()]-height[tmp])*(i-stack.peek()-1);
                        }
                        else
                        {
                            area+=(height[i]-height[tmp])*(i-stack.peek()-1);
                            stack.push(i);
                            break;
                        }
                    }
                }
            }
        }
        return area;
    }
}