public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i<9; i++)
        {
            for (int j = 0; j<9; j++)
            {
                if (board[i][j]!='.')
                {
                    if (!isValid(board, i, j, board[i][j]))
                        return false;
                }
            }
        }
        return true;
    }
    
    public boolean isValid(char[][] board, int i, int j, char c){
        //Check colum
        for(int row = 0; row < 9; row++)
            if (row!=i)
                if(board[row][j] == c)
                    return false;

        //Check row
        for(int col = 0; col < 9; col++)
            if (col!=j)
                if(board[i][col] == c)
                    return false;

        //Check 3 x 3 block
        for(int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
            for(int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
                if (row!=i&&col!=j)
                    if(board[row][col] == c)
                        return false;
        return true;
    }
}