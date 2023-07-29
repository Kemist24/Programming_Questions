class Solution {
    public boolean searchMatrix(int[][] mat, int key) {
        int i =0;
        int j = mat[0].length-1;

        while(i<mat.length & j>=0)
        {
            if(mat[i][j] == key)
            {
                return true;
            }
            else if(key<mat[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
 }
