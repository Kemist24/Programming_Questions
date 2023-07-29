//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG{
	public static void main(String args[]) throws IOException { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
       		int rows=sc.nextInt();
       		int columns=sc.nextInt();
			
			int matrix[][]=new int[rows][columns];
          
        	for(int i=0; i<rows;i++){            
            	for(int j=0; j<columns;j++){
                	matrix[i][j]=sc.nextInt();
            	}
         	}
         	int target = sc.nextInt();
         	
			Solution x = new Solution();
			
			if (x.search(matrix, rows, columns, target)) 
				System.out.println(1); 
			else
				System.out.println(0); 
			t--;
		}
	} 
}
// } Driver Code Ends




class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int mat[][], int N, int M, int key) 
	{  
        int i =0;
        int j = M-1;

        while(i<N & j>=0)
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
	