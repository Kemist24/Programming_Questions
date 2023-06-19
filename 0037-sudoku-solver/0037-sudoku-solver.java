class Solution {
    public void solveSudoku(char[][] board) {
         helperSolveSudoku(board, 0, 0);
        
        
    }

    // public static void display(char[][] board){
    //     for(int i =0; i<board.length; i++)
    //     {
            
    //         for(int j=0; j<board[0].length; j++)
    //         {
    //             System.out.print(board[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    public static boolean helperSolveSudoku(char[][] board, int i, int j)
    {
        if(i == board.length)
        {
            //display(board);
            return true;
        }
        
        int ni = 0;
        int nj = 0;
        int REDIX=10;

        char char2[][] = new char[2][2];

        if(j == board[0].length-1)
        {
            ni = i+1;
            nj = 0;
        }
        else
        {
            ni = i;
            nj = j+1;
        }

        if(board[i][j] != '.')
        {
            if(helperSolveSudoku(board, ni, nj)){
                return true;
            }
        }
        else
        {
            for(int pos = 1; pos<=9; pos++)
            {
                if(isValid(board, i, j, pos) == true)
                {
                    board[i][j] = (char)(pos+'0');
                    if(helperSolveSudoku(board, ni, nj)){
                        return true;
                    }
                    else{
                             board[i][j] = '.';
                    }
                   

                }
            }
        }
return false;
    }

    public static boolean isValid(char[][] board, int x, int y, int val)
    {
        for(int j = 0; j<board[0].length; j++)
        {
            if(board[x][j] == (char)(val+'0'))
            {
                return false;
            }
        }

        for(int i = 0; i<board.length; i++)
        {
            if(board[i][y] == (char)(val+'0'))
            {
                return false;
            }
        }

        int sub_matrix_i = x/3*3;
        int sub_matrix_j = y/3*3;
        for(int i=0; i < 3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(board[i + sub_matrix_i][j + sub_matrix_j] == (char)(val+'0'))
                {
                    return false;
                }
            }
        }
        return true;
    }
}