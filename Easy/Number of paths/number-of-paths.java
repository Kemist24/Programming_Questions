//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int m = Integer.parseInt(inputLine[0]);
		    int n = Integer.parseInt(inputLine[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.numberOfPaths(m, n));
		}
	}
}




// } Driver Code Ends


class Solution{
    
    long numberOfPaths(int m, int n) {
        if(m ==1 || n== 1) // this is the base condition as when we reach the bottom of the matrix(m=1) we can only go right so only one path possible same as when we reach top right(n=1) of the matrix we can only go down so only one path possible
        {
            return 1;
        }
        
        return numberOfPaths(m-1, n) + numberOfPaths(m, n-1); // we keep on decreasing the m and n respectively to recursively get our answer.
    }
    
}
