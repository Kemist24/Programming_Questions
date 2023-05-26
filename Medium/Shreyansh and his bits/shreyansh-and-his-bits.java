//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            long  N = Long.parseLong(input_line[0]);
            Solution ob = new Solution();
            System.out.println(ob.count(N));
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    long arr[][];
    long count(long n)
    {
        arr = new long[40][40];
        for(int i=0; i<40; i++)
        Arrays.fill(arr[i], -1);
        int bor = 0;
        int one = 0;
        long ans = 0;
        
        while(n>0)
        {
           if((n&1) != 0)
           {
              one++;
              ans += ncr(bor, one); // we used 2d array to get ans on O(1)
               
           }
          n = n>>1;
           bor++;
            
            
        }
        return ans;
    }
    
    long ncr(int n, int r)
    {
        if(r==0 || r==n)
         return 1;
        if(r>n)
         return 0;
         
         if(arr[n][r] != -1)
         {
             return arr[n][r];
         }
         return arr[n][r] = ncr(n-1, r-1) + ncr(n-1,r);
    }
    
}