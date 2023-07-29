//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> arr =  new ArrayList<>();
      int row_st = 0;
      int row_end = r-1;
      int col_st = 0;
      int col_end = c-1;
      
      while(row_st<=row_end && col_st <= col_end)
      {
          for(int col = col_st; col<=col_end; col++)
          {
              arr.add(matrix[row_st][col]);
          }
          row_st++;
          
          for(int row = row_st; row<=row_end; row++)
          {
              arr.add(matrix[row][col_end]);
          }
          col_end--;
          
       
              for(int col=col_end; col>=col_st; col--)
              {
                     if(row_st>row_end)
          {
              break;
          }
                  arr.add(matrix[row_end][col]);
              }
              row_end--;
          
         
              for(int row = row_end; row>=row_st; row--)
              {
                  if(col_st > col_end)
          {
              break;
          }
                  arr.add(matrix[row][col_st]);
              }
              col_st++;
          
      
      }
      return arr;
    }
}