//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Long t = Long.parseLong(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPallindrome(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long isPallindrome(long N){
       String str = Long.toBinaryString(N);
       for(int i =0; i<str.length()/2; i++)
       {
           if (str.charAt(i) != str.charAt(str.length()-i-1))
           {
               return 0;
           }
          
       }
       return 1;
    }
}