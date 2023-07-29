//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int mat[][] = new int[n][m];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                  mat[i][j] = sc.nextInt();
            }
            
            int x = sc.nextInt();
            
            System.out.println (new Sol().matSearch(mat, n, m, x));
        }
        
    }
}
// } Driver Code Ends


class Sol
{
    public static int matSearch(int mat[][], int N, int M, int key)
    {
        int i =0;
        int j = M-1;
        
        while(i<N & j>=0)
        {
            if(mat[i][j] == key)
            {
                return 1;
            }
            else if(key<mat[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        return 0;
    }
}