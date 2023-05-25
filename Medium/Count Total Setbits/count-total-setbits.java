//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.countBits(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
     static int countBits(int A) {
        
        if(A==0){
            return 0;
        }
        int x = largest2xvalue(A);
        int b_tillx = x * (1 << (x - 1));
        int msbfromx_to_A = A - (1 << x) + 1;
        int rest = A - (1 << x);
        int ans  = b_tillx + msbfromx_to_A + countBits(rest);
        return ans;
    }
    public static int largest2xvalue (int A)
         {
             int x = 0;
             while((1<<x) <= A)
             {
                 x++;
             }
             return x-1;
         }
}

