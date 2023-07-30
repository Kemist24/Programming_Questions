class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix[0].length,n=matrix.length;
        int[][] tm = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++) 
            {
                tm[i][j] = matrix[j][i];
            }
        }
        return tm;
    }
}