//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            int[] A = new int[N];
            String S[] = read.readLine().split(" ");
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.getVal(N,A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long getVal(int N, int[] arr) {
        double ans=1;
        double ans1=0;
      double cnt=arr[0];
       for(int i=0;i<N;i++){
           ans=(ans*arr[i]) % 1000000007;
           cnt= gcd(arr[i],cnt);
       }
       ans1=Math.pow(ans,cnt);
       long x = (long) ans1;
       return x;
    }
    
    static double gcd(double a, double b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}