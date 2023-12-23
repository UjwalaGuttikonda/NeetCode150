class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> str = new HashSet();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char current = board[i][j];
                if(current != '.')
                {
                if(!str.add(current + "found in row" +i)||
                !str.add(current + "found in column" +j)||
                !str.add(current + "found in block" +i/3 + "-" + j/3))
                {
                    return false;
                }}
            }
        }
        return true;
    }
}