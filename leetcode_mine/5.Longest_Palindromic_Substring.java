public class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int start = 0, max = 0;
        boolean [][] dp = new boolean[len][len];
        // dp
        for ( int i = len - 1; i >= 0; i-- )
        {
            for ( int j = i; j <= len - 1; j++ )
            {
                if ( s.charAt( i ) == s.charAt( j ) )
                {
                    if ( i + 1 > j - 1 )
                    {
                        dp[i][j] = true;
                    } else if ( dp[i + 1][j - 1] == true )
                    {
                        dp[i][j] = true;
                    }
                    if ( dp[i][j] == true &&  j - i + 1 > max )
                    {
                        start = i;
                        max = j - i + 1;
                    } 
                }
            }
        }
        return s.substring( start, start + max );
    }
}