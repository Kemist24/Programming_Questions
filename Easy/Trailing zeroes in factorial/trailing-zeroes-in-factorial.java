//{ Driver Code Starts
//Initial Template for Java
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
            int N = sc.nextInt();
			
            Solution ob = new Solution();
            int ans  = ob.trailingZeroes(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int trailingZeroes(int N){
        int res =0;
        for (int i =5; i<=N; i = i*5) 
        /* by dividing with 5 we get no. of 5 till that no. and 
        when 25 comes we need to divide by 25 as there are 2 5's in 25 and so on like 125 625 etc only 
        when n is greater than these no.s thats why we are doing i=i*5 
        */
        {
            res = res+(N/i);
        }
        return res;
    }
}